package com.lmars.search.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmars.common.pojo.MapResult;
import com.lmars.common.utils.JsonUtils;
import com.lmars.compoment.JedisClient;
import com.lmars.mapper.TbMapserviceLayersMapper;
import com.lmars.mapper.TbMapserviceMapper;
import com.lmars.mapper.TbWmsLayersMapper;
import com.lmars.mapper.TbWmsMapper;
import com.lmars.pojo.TbMapserviceLayers;
import com.lmars.pojo.TbMapserviceLayersExample;
import com.lmars.pojo.TbMapserviceWithBLOBs;
import com.lmars.pojo.TbWmsLayers;
import com.lmars.pojo.TbWmsLayersExample;
import com.lmars.pojo.TbWmsLayersExample.Criteria;
import com.lmars.pojo.TbWmsWithBLOBs;
import com.lmars.search.pojo.InitialVisualLayer;
import com.lmars.search.pojo.ServiceItem;
import com.lmars.search.pojo.VisualLayer;
import com.lmars.search.pojo.VisualParams;
import com.lmars.search.service.VisualLayerService;
@Service
public class VisualLayerServiceImpl implements VisualLayerService {

	@Autowired
	public  TbWmsMapper wmsMapper;
	
	@Autowired
	public  TbWmsLayersMapper wmsLayerMapper;
	
	@Autowired
	public  TbMapserviceMapper esriMapper;
	
	@Autowired
	public  TbMapserviceLayersMapper esriLayerMapper;
	
	@Autowired
	public  JedisClient jedisClient;
	
	@Override
	public MapResult getVisualParam(Long id) {
		
		String url;
		List<VisualLayer> layers = new ArrayList<>();
		VisualParams param = new VisualParams();
		
		//查询缓存，有缓存就直接取出来
		try {
			String json = jedisClient.get("VISUAL_LAYERS:"+id);
			//判断是否存在
			if(StringUtils.isNotBlank(json)){
				// 把json转为java对象
				param = JsonUtils.jsonToPojo(json, VisualParams.class);
				return MapResult.ok(param);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//缓存中没有，查询数据库
		if(id<20000000 && id>10000000){
			
			
			url = getWMSUrl(id);
			if(url != null){
				layers = getWMSVisualLayers(id);
				param.setUrl(url);
				param.setLayers(layers);
				
				//加入缓存中
				String json = JsonUtils.objectToJson(param);
				try {
					jedisClient.set("VISUAL_LAYERS:"+id, json); 
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				return MapResult.ok(param);
				
			}
			return MapResult.build(404, "Can't find the Service with ID:"+id);
		}else{
			
			url = getESRIUrl(id);
			if(url != null){
				layers = getEsriVisualLayers(id);
				param.setUrl(url);
				param.setLayers(layers);
				
				//加入缓存中
				String json = JsonUtils.objectToJson(param);
				try {
					jedisClient.set("VISUAL_LAYERS:"+id, json); 
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				return MapResult.ok(param);
			}
			
			return MapResult.build(404, "Can't find the Service with ID:"+id);
		}
	}
	/**
	 * 根据ID获取Esri mapService Url
	 * @param id
	 * @return
	 */
	public  String getESRIUrl(Long id){
		TbMapserviceWithBLOBs mapService = esriMapper.selectByPrimaryKey(id);
		if(mapService != null){
			return mapService.getMapserviceurl().split("\\?")[0];
		}
		return null;
	}
	
	public   List<VisualLayer> getEsriVisualLayers(Long id){
		
		TbMapserviceLayersExample example = new TbMapserviceLayersExample();
		com.lmars.pojo.TbMapserviceLayersExample.Criteria criteria = example.createCriteria();
		criteria.andMapserviceidEqualTo(id);
		
		List<VisualLayer> visualLayers = new ArrayList<>();
		List<TbMapserviceLayers> layers = esriLayerMapper.selectByExample(example);
		if(layers != null && layers.size()>0){
			for (TbMapserviceLayers tbMapserviceLayers : layers) {
				VisualLayer layer  = new VisualLayer();
				layer.setLayerId(tbMapserviceLayers.getLayerid());
				layer.setName(tbMapserviceLayers.getLayername());
				
				visualLayers.add(layer);
			}
		}
		return visualLayers;
	}
	/**
	 * 获取wms URL
	 * @param id
	 * @return
	 */
	public  String getWMSUrl(Long id){
		System.out.println("wmsMapper:"+wmsMapper);
		TbWmsWithBLOBs wms = wmsMapper.selectByPrimaryKey(id);
		if(wms != null){
			return wms.getUrl().split("\\?")[0]+"?";
		}
		return null;
	}
	/**
	 * 获取WMS 图层参数信息
	 * @param id
	 * @return
	 */
	public  List<VisualLayer> getWMSVisualLayers(Long id){
		
		TbWmsLayersExample example = new TbWmsLayersExample();
		Criteria criteria = example.createCriteria();
		criteria.andWmsidEqualTo(id);
		
		List<VisualLayer> visualLayers = new ArrayList<>();
		
		List<TbWmsLayers> layers = wmsLayerMapper.selectByExample(example);
		if(layers != null && layers.size() > 0){
			for (TbWmsLayers tbWmsLayers : layers) {
				
				VisualLayer layer  = new VisualLayer();
				layer.setLayerId(tbWmsLayers.getCurrentid());
				layer.setName(tbWmsLayers.getName());
				
				visualLayers.add(layer);
			}
		}
		
		return visualLayers;
	}
	@Override
	public MapResult getWMSInitialLayerParams(Long id,String layerName) {
		//先查询此服务Id 下的所有图层
		TbWmsLayersExample example = new TbWmsLayersExample();
		Criteria criteria = example.createCriteria();
		criteria.andWmsidEqualTo(id);
		criteria.andNameEqualTo(layerName);
		List<TbWmsLayers> layers = wmsLayerMapper.selectByExample(example);
		
		if(layers.size()==0)
			return MapResult.build(404, "Can't find the layer!");
		
		String boundingbox = layers.get(0).getBoundingbox();
		if(boundingbox != null){
			
			String[] params = boundingbox.split(" ");
			if(params.length == 2){
				
				InitialVisualLayer layer = new InitialVisualLayer();
				
				String crs = params[0];
				String[] box = params[1].split(",");
				double southLat = Double.parseDouble(box[0]);
				double westLon = Double.parseDouble(box[1]);
				double northLat = Double.parseDouble(box[2]);
				double eastLon = Double.parseDouble(box[3]);
				
				layer.setCrs(crs);
				layer.setSourthLatitude(southLat);
				layer.setWestLongitude(westLon);
				layer.setNorthLatitude(northLat);
				layer.setEastLongitude(eastLon);
				
				return MapResult.ok(layer);
			}
		}
		return MapResult.build(300, "The CRS is Not EPSG4326！");
		
	}
}
