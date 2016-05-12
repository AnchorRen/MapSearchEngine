package com.lmars.solrj;

import org.junit.Test;

import com.lmars.common.utils.JsonUtils;
import com.lmars.search.pojo.DocumentInfo;
import com.lmars.search.pojo.MapServiceDocumentInfo;

public class JsonTest {

	@Test
	public void JsonConvertTest(){
		String string = "{\"Category\":\"non-EDW\",\"Comments\":\"This map service is designed to work with the Interactive Visitor Map (IVM) application while the application is developed.\",\"Subject\":\"Reference Layers used in the Interactive Visitor Map\",\"Author\":\"GSTC\",\"TextAntialiasingMode\":\"Force\",\"Keywords\":\"GSTC,Interactive Visitor Map,IVM,Trails,Roads\",\"AntialiasingMode\":\"None\",\"Title\":\"Interactive Visitor Map - Reference Layers\"}";
		//String string= "{\"category\":\"ttt\",\"author\":\"Anchor\",\"keywords\":\"good\",\"antialiasingMode\":\"dd\",\"title\":null,\"comments\":null,\"subject\":null,\"textAntialiasingMode\":null}";
		MapServiceDocumentInfo docInfo = JsonUtils.jsonToPojo(string, MapServiceDocumentInfo.class);
		System.out.println(docInfo);
		System.out.println(JsonUtils.objectToJson(docInfo));
				
	}
	
	
	@Test
	public void JsonConvertTest2(){
		String string = "{\"Category\":\"non-EDW\",\"Comments\":\"This map service is designed to work with the Interactive Visitor Map (IVM) application while the application is developed.\",\"Subject\":\"Reference Layers used in the Interactive Visitor Map\",\"Author\":\"GSTC\",\"TextAntialiasingMode\":\"Force\",\"Keywords\":\"GSTC,Interactive Visitor Map,IVM,Trails,Roads\",\"AntialiasingMode\":\"None\",\"Title\":\"Interactive Visitor Map - Reference Layers\"}";
		//String string= "{\"category\":\"ttt\",\"author\":\"Anchor\",\"keywords\":\"good\",\"antialiasingMode\":\"dd\",\"title\":null,\"comments\":null,\"subject\":null,\"textAntialiasingMode\":null}";
		DocumentInfo docInfo = JsonUtils.jsonToPojo(string, DocumentInfo.class);
		System.out.println(docInfo);
		System.out.println(JsonUtils.objectToJson(docInfo));
				
	}
	
	@Test
	public void JsonConvertTestS(){
				
	
		MapServiceDocumentInfo doc = new MapServiceDocumentInfo();
		doc.setAntialiasingMode("dd");
		doc.setAuthor("Anchor");
		doc.setCategory("ttt");
		doc.setKeywords("good");
		
		String json = JsonUtils.objectToJson(doc);
		System.out.println(json);
	}
}
