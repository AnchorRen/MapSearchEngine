package com.lmars.solrj;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

public class SolrJTest {

	@Test
	public void testSolrJ() throws Exception, Exception{
	
		//创建连接
		SolrServer solrServer = new HttpSolrServer("http://localhost:8080/solr");
		//创建一个文档对象
		SolrInputDocument document = new SolrInputDocument();
		
		//添加域
		document.addField("id", "002");
		document.addField("wmsId", "10000001");
		document.addField("mapName", "Map For DCE");
		document.addField("mapTitle", "This is a title");
		document.addField("mapDesc", "Good Map t!");
		document.addField("images", "http:132.com");
		
		//添加到索引库
		solrServer.add(document);
		//提交
		solrServer.commit();
	}
	
	@Test
	public void testQuery() throws Exception{
		
		SolrServer solrServer = new HttpSolrServer("http://localhost:8180/solr");
		//创建一个查询对象
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		//执行查询
		QueryResponse response = solrServer.query(query);
		//获取查询结果
		SolrDocumentList documentList = response.getResults();
		for (SolrDocument solrDocument : documentList) {
			System.out.println(solrDocument.get("id"));
			System.out.println(solrDocument.get("wmsId"));
			System.out.println(solrDocument.get("mapName"));
			System.out.println(solrDocument.get("mapDesc"));
			System.out.println(solrDocument.get("images"));
		}
	}
	
	@Test 
	public void testDelete() throws Exception, Exception{
		
		SolrServer solrServer = new HttpSolrServer("http://localhost:8180/solr");
		
		solrServer.deleteByQuery("*:*");
		solrServer.commit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
