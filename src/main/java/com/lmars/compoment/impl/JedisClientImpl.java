package com.lmars.compoment.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.lmars.compoment.JedisClient;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisClientImpl implements JedisClient {

	@Autowired
	private JedisPool jedisPool;

	@Override
	public String set(String key, String value) {

		Jedis jedis = jedisPool.getResource();
		String result = jedis.set(key, value);
		jedis.close();

		return result;
	}

	@Override
	public String get(String key) {

		Jedis jedis = jedisPool.getResource();
		String value = jedis.get(key);
		jedis.close();

		return value;
	}

	@Override
	public Long hset(String key, String item, String value) {

		Jedis jedis = jedisPool.getResource();
		Long result = jedis.hset(key, item, value);
		jedis.close();

		return result;
	}

	@Override
	public String hget(String key, String item) {

		Jedis jedis = jedisPool.getResource();
		String value = jedis.hget(key, item);
		jedis.close();
		return value;
	}

	@Override
	public Long incr(String key) {

		Jedis jedis = jedisPool.getResource();
		Long result = jedis.incr(key);
		jedis.close();

		return result;
	}

	@Override
	public Long decr(String key) {

		Jedis jedis = jedisPool.getResource();
		Long result = jedis.decr(key);
		jedis.close();

		return result;
	}

	@Override
	public Long expire(String key, int second) {

		Jedis jedis = jedisPool.getResource();
		Long result = jedis.expire(key, second);
		jedis.close();

		return result;
	}

	@Override
	public Long ttl(String key) {

		Jedis jedis = jedisPool.getResource();
		Long result = jedis.ttl(key);
		jedis.close();

		return result;
	}

	@Override
	public Long hdel(String key, String item) {

		Jedis jedis = jedisPool.getResource();
		Long result = jedis.hdel(key, item);
		return result;
	}
}
