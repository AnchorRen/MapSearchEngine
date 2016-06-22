package com.lmars.redis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lmars.compoment.JedisClient;
import redis.clients.jedis.Jedis;

public class JedisTest {

	@Test
	public void JedisTest(){
		Jedis jedis = new Jedis("localhost",6379);
		int id = 20000001;
		String result = jedis.set("555", "SUCCESS!");
		String test = jedis.get("555");
		System.out.println(test);
		jedis.close();
	}
	
	
	@Test
	public void testJedisClientSpring(){
		ApplicationContext ap = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		
		JedisClient client = ap.getBean(JedisClient.class);
//		String result = client.set("555", "SUCCESS!");
		
		for(int i =20000001;i<=20010000;i++){
			
			Long result = client.expire("MAP_ITEM:"+i, 0);
			if(result > 0){
				System.out.println(result);
			}
		}
		
		//System.out.println(client.get("MAP_ITEM:20003838"));
		//client.expire("MAP_ITEM:20003838", 0);
		//System.out.println("----------------");
		//System.out.println(client.get("MAP_ITEM:20003838"));
	}
	
	
	
}
