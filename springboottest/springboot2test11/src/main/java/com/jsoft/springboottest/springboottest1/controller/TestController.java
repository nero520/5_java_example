package com.jsoft.springboottest.springboottest1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    
    @Autowired
    RedisUtil redisUtil;
    
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    
    @RequestMapping("/set")
    public void set() {
        redisUtil.set("test", "8888888");
    }
	
	@RequestMapping("/show")
	public String show(){

		return "Hello World"+redisUtil.get("test");
	}
}
