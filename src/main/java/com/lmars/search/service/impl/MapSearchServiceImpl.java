package com.lmars.search.service.impl;

import java.util.List;

import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmars.search.dao.SearchDao;
import com.lmars.search.pojo.SearchItem;
import com.lmars.search.pojo.SearchResult;
import com.lmars.search.service.MapSearchService;
/*
 * 关键字搜索Controller
 */
@Service
public class MapSearchServiceImpl implements MapSearchService {

	@Autowired
	private SearchDao searchDao;
	
	@Override
	public SearchResult search(String queryString, int page, int rows) throws Exception {

		//创建查询条件
		SolrQuery query = new SolrQuery();
		query.setQuery(queryString);
		
		//分页条件
		query.setStart((page-1)*rows);
		query.setRows(rows);
		
		//设置默认搜索域
		query.set("df", "map_keywords");
		
		//设置高亮
		query.setHighlight(true);
		//设置高亮片段的长度
		query.setHighlightFragsize(300);
		query.addHighlightField("mapName");
		query.addHighlightField("mapDesc");
		query.setHighlightSimplePre("<font style=\"color:red\">");
		query.setHighlightSimplePost("</font>");
		
		//执行查询
		SearchResult result = searchDao.search(query);
		
		//计算总页数
		Long recordCount = result.getRecordCount();
		int pageCount = (int)( recordCount / rows);
		
		if(recordCount % rows > 0){
			pageCount++;
		}
		result.setPageCount(pageCount);
		result.setCurPage(page);
		
		List<SearchItem> list = result.getItemList();
		for (SearchItem searchItem : list) {
			System.out.println(searchItem.getMapDesc());
			System.out.println("-------------------");
		}
		
		return result;
	}

}
