package com.atguigu.gmall0715.config;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {
     /*
     0. 创建JedisPool
     1. 获取Jedis
      */
    // 创建JedisPool
    private JedisPool jedisPool;
    //初始化连接池工厂
    public void initJedisPool(String host,int port,int timeout){
        // 初始化参数配置
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        // 如果要密码，则需要修改redis.conf 配置文件。
        // 设置最大连接数
        jedisPoolConfig.setMaxTotal(200);
        // 如果说达到最大连接数，可以使进行进行排队等待
        jedisPoolConfig.setBlockWhenExhausted(true);
        // 设置等待的时间
        jedisPoolConfig.setMaxWaitMillis(10*1000);
        //设置最小剩余数
        jedisPoolConfig.setMinIdle(10);
        // 表示获取到连接的时候，自检一下当前连接是否可以使用！
        jedisPoolConfig.setTestOnBorrow(true);
        jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout);
    }
    // 获取Jedis
    public Jedis getJedis(){
        Jedis jedis = jedisPool.getResource();// 获取Jedis
        return jedis;
    }
}
