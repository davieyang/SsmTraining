package com.davieyang.test;

import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * redis缓存测试
 *
 * @author davieyang
 * @create 2018/07/08
 **/
public class RedisTest extends BaseJunit4Test {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    public void testRedis() {
        redisTemplate.opsForValue().set("name", "davieyang");
        String name = (String) redisTemplate.opsForValue().get("name");
        System.out.println("value of name is:" + name);
    }
}
