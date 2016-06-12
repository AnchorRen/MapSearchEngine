package com.lmars.search.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lmars.search.dao.SearchDao;
import com.lmars.search.pojo.SearchItem;
import com.lmars.search.pojo.SearchResult;

@Repository
public class SearchDaoImpl implements SearchDao {

	@Autowired
	private SolrServer solrServer;

	@Override
	public SearchResult search(SolrQuery query) throws Exception {

		// 执行查询
		QueryResponse response = solrServer.query(query);
		// 取查询结果列表
		SolrDocumentList solrDocumentList = response.getResults();

		List<SearchItem> itemList = new ArrayList<>();

		for (SolrDocument solrDocument : solrDocumentList) {
			// 创建一个SearchItem
			SearchItem item = new SearchItem();
			item.setId((String) solrDocument.get("id"));
			item.setImages((String) solrDocument.get("images"));
			item.setServiceId((String) solrDocument.get("serviceId"));
			item.setMapName((String)solrDocument.get("mapName"));

			// 取高亮显示
			Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();
			List<String> mapTitleList = highlighting.get(solrDocument.get("id")).get("mapTitle");
			List<String> mapDescList = highlighting.get(solrDocument.get("id")).get("mapDesc");

			String mapTitle = "";
			String mapDesc = "";
			if (mapTitleList != null && mapTitleList.size() > 0) {
				// 取高亮后的结果
				mapTitle = mapTitleList.get(0);
			} else {
				// 如果没有高亮结果，就取原结果
				mapTitle = (String) solrDocument.get("mapTitle");
			}

			if (mapDescList != null && mapDescList.size() > 0) {
				// 取高亮后的结果
				mapDesc = mapDescList.get(0);
			} else {
				// 如果没有高亮结果，就取原结果
				mapDesc = (String) solrDocument.get("mapDesc");
				if(mapDesc.length()>300){
					mapDesc = mapDesc.substring(0, 300);
				}
			}
			// 把标题和名称添加到结果中
			item.setMapTitle(mapTitle);
			item.setMapDesc(mapDesc);

			// 添加到列表
			itemList.add(item);
		}

		SearchResult result = new SearchResult();
		result.setItemList(itemList);
		// 查询结果总数
		result.setRecordCount(solrDocumentList.getNumFound());

		return result;
	}

}
