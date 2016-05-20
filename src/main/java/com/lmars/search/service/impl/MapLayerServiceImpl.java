package com.lmars.search.service.impl;

import java.io.IOException;
import java.util.List;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmars.common.pojo.MapResult;
import com.lmars.common.utils.ExceptionUtil;
import com.lmars.pojo.TbMapserviceLayers;
import com.lmars.pojo.TbWmsLayers;
import com.lmars.search.mapper.ItemMapper;
import com.lmars.search.pojo.SearchItem;
import com.lmars.search.service.MapLayerService;
/*
 * 导入图层到Solr索引库  Service
 */
@Service
public class MapLayerServiceImpl implements MapLayerService {

	@Autowired
	private SolrServer solrServer;
	
	@Autowired
	private ItemMapper itemMapper;
	
	
	@Override
	public MapResult importWMSLayers() throws Exception {
		
		//查询数据库，获得wms图层列表
		List<SearchItem> itemList = itemMapper.getWMSItemList();
		
		for (SearchItem item : itemList) {
			//创建文档对象
			SolrInputDocument document = new SolrInputDocument();
			//添加域
			document.addField("id", item.getId());
			document.addField("serviceId", item.getServiceId());
			document.addField("mapName", item.getMapName());
			document.addField("mapDesc", item.getMapDesc());
			document.addField("images", item.getImages());
			//写入索引库
			solrServer.add(document);
		}
		//提交
		solrServer.commit();
		
		return MapResult.ok();
	}

	@Override
	public MapResult importMapServiceLayers() throws Exception {
		
		//查询数据库，获得wms图层列表
		List<SearchItem> itemList = itemMapper.getMapServiceItemList();
		
		for (SearchItem item : itemList) {
			//创建文档对象
			SolrInputDocument document = new SolrInputDocument();
			//添加域
			document.addField("id", item.getId());
			document.addField("serviceId", item.getServiceId());
			document.addField("mapName", item.getMapName());
			document.addField("mapDesc", item.getMapDesc());
			document.addField("images", item.getImages());
			//写入索引库
			solrServer.add(document);
		}
		//提交
		solrServer.commit();
		
		return MapResult.ok();
	}

	@Override
	public MapResult updateWMSLayerIndex(TbWmsLayers layer) {

		try {
			//创建文档对象
			SolrInputDocument document = new SolrInputDocument();
			//添加域
			document.addField("id", layer.getId());
			document.addField("serviceId", layer.getWmsid());
			document.addField("mapName", layer.getTitle());
			document.addField("mapDesc", layer.getAbstracts());
			document.addField("images", layer.getImages());
			//写入索引库
			solrServer.add(document);
			//提交
			solrServer.commit();
			return MapResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return MapResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	
	}

	@Override
	public MapResult updateMapServiceLayerIndex(TbMapserviceLayers layer) {
		try {
			//创建文档对象
			SolrInputDocument document = new SolrInputDocument();
			//添加域
			document.addField("id", layer.getId());
			document.addField("serviceId", layer.getMapserviceid());
			document.addField("mapName", layer.getLayername());
			document.addField("mapDesc", layer.getDescription());
			document.addField("images", layer.getImages());
			//写入索引库
			solrServer.add(document);
			//提交
			solrServer.commit();
			return MapResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return MapResult.build(500, ExceptionUtil.getStackTrace(e));
		} 
	}

	@Override
	public MapResult deleteLayerIndex(Long id) throws Exception {

		solrServer.deleteByQuery("id:"+id);
		solrServer.commit();
		
		return MapResult.ok();
	}

}
