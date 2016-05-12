package com.lmars.search.dao;

import org.apache.solr.client.solrj.SolrQuery;

import com.lmars.search.pojo.SearchResult;
/*
 * 关键字搜索Dao
 */
public interface SearchDao {

	public SearchResult search(SolrQuery query) throws Exception;
}
