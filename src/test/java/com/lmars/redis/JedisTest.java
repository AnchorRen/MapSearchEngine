package com.lmars.redis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lmars.compoment.JedisClient;
import redis.clients.jedis.Jedis;

public class JedisTest {

	@Test
	public void JedisTest(){
		Jedis jedis = new Jedis("192.168.253.129",6379);
		int id = 20000001;
		String test = jedis.get("MAP_ITEM:"+id);
		System.out.println(test);
		jedis.close();
	}
	
	
	@Test
	public void testJedisClientSpring(){
		ApplicationContext ap = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		
		JedisClient client = ap.getBean(JedisClient.class);
		//String result = client.set("555", "SUCCESS!");
		
		System.out.println(client.get("test"));
	}
	
	
	
}
