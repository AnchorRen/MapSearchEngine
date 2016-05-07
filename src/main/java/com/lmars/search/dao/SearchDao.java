package com.lmars.search.dao;

import org.apache.solr.client.solrj.SolrQuery;

import com.lmars.search.pojo.SearchResult;

public interface SearchDao {

	public SearchResult search(SolrQuery query) throws Exception;
}
