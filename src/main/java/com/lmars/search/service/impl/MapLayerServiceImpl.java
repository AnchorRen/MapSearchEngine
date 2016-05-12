package com.lmars.search.service.impl;

import java.util.List;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmars.common.pojo.MapResult;
import com.lmars.search.mapper.ItemMapper;
import com.lmars.search.pojo.SearchItem;
import com.lmars.search.service.MapLayerService;
/*
 * 图层导入Service
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

}
