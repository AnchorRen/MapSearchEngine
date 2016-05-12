package com.lmars.service.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lmars.common.utils.JsonUtils;
import com.lmars.compoment.JedisClient;
import com.lmars.search.pojo.ServiceItem;
import com.lmars.search.service.MapInfoService;

public class MapInfoServiceTest {

	@Test
	public void getMapInfoTtest(){
		ApplicationContext ap = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		
		MapInfoService service = ap.getBean(MapInfoService.class);
		ServiceItem item = service.getMapInfo(10002359L);
		String json = JsonUtils.objectToJson(item);
		System.out.println(json);
	}
}
