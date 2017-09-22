package com.tengyun.wan.test.helloworld;

import redis.clients.jedis.Jedis;

public class RedisTest {
	
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connect success!");
		
		jedis.set("mysite", "www.tengyun.com");
		System.out.println("redis test,the key is 'mysite',and the value is '" + jedis.get("mysite") + "'");
	}

}
