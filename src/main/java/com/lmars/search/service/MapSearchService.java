package com.lmars.search.service;

import com.lmars.search.pojo.SearchResult;

public interface MapSearchService {

	public SearchResult search(String queryString,int page,int rows) throws Exception;
}
