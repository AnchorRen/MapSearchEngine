package com.lmars.search.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lmars.common.utils.JsonUtils;
import com.lmars.compoment.JedisClient;
import com.lmars.mapper.TbMapserviceLayersMapper;
import com.lmars.mapper.TbMapserviceMapper;
import com.lmars.mapper.TbWmsContactMapper;
import com.lmars.mapper.TbWmsLayersMapper;
import com.lmars.mapper.TbWmsMapper;
import com.lmars.pojo.TbMapserviceLayers;
import com.lmars.pojo.TbMapserviceLayersExample;
import com.lmars.pojo.TbMapserviceWithBLOBs;
import com.lmars.pojo.TbWmsContact;
import com.lmars.pojo.TbWmsContactExample;
import com.lmars.pojo.TbWmsContactExample.Criteria;
import com.lmars.pojo.TbWmsLayers;
import com.lmars.pojo.TbWmsLayersExample;
import com.lmars.pojo.TbWmsWithBLOBs;
import com.lmars.search.pojo.DocumentInfo;
import com.lmars.search.pojo.Layer;
import com.lmars.search.pojo.MapServiceDocumentInfo;
import com.lmars.search.pojo.ServiceInfo;
import com.lmars.search.pojo.ServiceItem;
import com.lmars.search.service.MapInfoService;

/*
 * 查询服务详细信息Service
 */
@Service
public class MapInfoServiceImpl implements MapInfoService {

	@Autowired
	public TbWmsMapper wmsMapper;

	@Autowired
	public TbWmsContactMapper contactMapper;

	@Autowired
	public TbWmsLayersMapper layersMapper;

	@Autowired
	public TbMapserviceMapper mapServiceMapper;

	@Autowired
	public TbMapserviceLayersMapper mapServiceLayerMapper;
	
	@Autowired
	public  JedisClient jedisClient;

	@Value("${MAP_ITEM}")
	public String MAP_ITEM;
	
	@Override
	public ServiceItem getMapInfo(Long id) {

		//查询缓存，有缓存就直接取出来
		try {
			String json = jedisClient.get("MAP_ITEM:"+id);
			//判断是否存在
			if(StringUtils.isNotBlank(json)){
				// 把json转为java对象
				ServiceItem item = JsonUtils.jsonToPojo(json, ServiceItem.class);
				return item;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//缓存中没有，则从数据库中查，然后写入缓存中
		ServiceItem item = new ServiceItem();
		
		if (id < 20000000){
			 item =  getWMSInfo(id);
		}else{
			 item =  getMapServiceInfo(id);
		}
		
		String json = JsonUtils.objectToJson(item);
		
		try {
			//加入缓存中
			jedisClient.set(MAP_ITEM+":"+id, json); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return item;
		
	}

	public ServiceItem getWMSInfo(Long id) {

		ServiceItem item = new ServiceItem();
		// 获取ServiceInfo
		TbWmsWithBLOBs wms = wmsMapper.selectByPrimaryKey(id);
		ServiceInfo serviceInfo = new ServiceInfo();
		if (wms != null && !wms.equals(null)) {
			
			serviceInfo.setId(wms.getId());
			serviceInfo.setAbstracts(wms.getAbstracts());
			serviceInfo.setAccess(wms.getAccess());
			serviceInfo.setFees(wms.getFees());
			serviceInfo.setKeywords(wms.getKeywords());
			serviceInfo.setTitle(wms.getTitle());
			serviceInfo.setUrl(wms.getUrl());
			serviceInfo.setVersion(wms.getVersion());
		}

		// 获取服务提供者信息
		TbWmsContactExample example = new TbWmsContactExample();
		Criteria criteria = example.createCriteria();
		criteria.andWmsIdEqualTo(id);
		List<TbWmsContact> contacts = contactMapper.selectByExample(example);
		TbWmsContact contact = new TbWmsContact();

		if (contacts != null && contacts.size()>0) {
			contact = contacts.get(0);// 如果查询到了结果，只能有一个
		}

		// 获取服务的 图层信息
		TbWmsLayersExample layerExample = new TbWmsLayersExample();
		com.lmars.pojo.TbWmsLayersExample.Criteria layerCriteria = layerExample.createCriteria();
		layerCriteria.andWmsidEqualTo(id);
		List<TbWmsLayers> wmsLayers = layersMapper.selectByExampleWithBLOBs(layerExample);
		List<Layer> layers = new ArrayList<>();
		if (wmsLayers != null) {
			for (TbWmsLayers wmsLayer : wmsLayers) {

				Layer layer = new Layer();
				layer.setDescription(wmsLayer.getAbstracts());
				layer.setImages(wmsLayer.getImages());
				layer.setLayerId(wmsLayer.getCurrentid());
				layer.setTitle(wmsLayer.getTitle());
				layer.setUrl(wmsLayer.getUrl());
				layer.setName(wmsLayer.getName());

				layers.add(layer);
			}
		}

		item.setLayers(layers);
		item.setServiceInfo(serviceInfo);
		item.setWmsContact(contact);

		return item;
	}

	public ServiceItem getMapServiceInfo(Long id) {

		ServiceItem item = new ServiceItem();

		// 获取并设置服务信息
		TbMapserviceWithBLOBs mapService = mapServiceMapper.selectByPrimaryKey(id);
		ServiceInfo serviceInfo = new ServiceInfo();
		DocumentInfo docInfo = new DocumentInfo();

		if (mapService != null) {
			serviceInfo.setId(mapService.getId());
			serviceInfo.setAbstracts(mapService.getServicedescription());
			serviceInfo.setAccess(mapService.getCopyrighttext());
			serviceInfo.setTitle(mapService.getMapname());
			serviceInfo.setUrl(mapService.getMapserviceurl());
			serviceInfo.setVersion(mapService.getCurrentversion());
			//获取文档信息
			String documentInfo = mapService.getDocumentinfo();
			docInfo = JsonUtils.jsonToPojo(documentInfo, DocumentInfo.class);
			
			serviceInfo.setKeywords(docInfo.getKeywords());
		}

		// 获取并设置图层信息
		TbMapserviceLayersExample example = new TbMapserviceLayersExample();
		com.lmars.pojo.TbMapserviceLayersExample.Criteria mapServiceCriteria = example.createCriteria();
		mapServiceCriteria.andMapserviceidEqualTo(id);
		List<TbMapserviceLayers> mapLayers = mapServiceLayerMapper.selectByExampleWithBLOBs(example);

		List<Layer> layers = new ArrayList<>();
		if (mapLayers != null) {

			for (TbMapserviceLayers mapLayer : mapLayers) {

				Layer layer = new Layer();
				layer.setDescription(mapLayer.getDescription());
				layer.setImages(mapLayer.getImages());
				layer.setLayerId(mapLayer.getLayerid());
				layer.setTitle(mapLayer.getLayername());
				layer.setUrl(mapLayer.getLayerurl());

				layers.add(layer);
			}
		}
		
		item.setDocumentInfo(docInfo);
		item.setLayers(layers);
		item.setServiceInfo(serviceInfo);
		
		return item;
	}

}
