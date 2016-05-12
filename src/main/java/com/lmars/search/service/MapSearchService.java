package com.lmars.search.service;

import com.lmars.search.pojo.SearchResult;

public interface MapSearchService {
	/*
	 * 根据关键字、页码、行数查询搜索结果
	 */
	public SearchResult search(String queryString,int page,int rows) throws Exception;
}
