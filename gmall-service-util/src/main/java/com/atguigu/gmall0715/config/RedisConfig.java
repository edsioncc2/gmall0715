package com.atguigu.gmall0715.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration// RedisConfig 使其变成xml
public class RedisConfig {
    // :disabled 表示如果配置文件中没有获取到host ，则表示默认值disabled
    @Value("${spring.redis.host:disabled}")
    private String host;

    @Value("${spring.redis.port:0}")
    private int port;


    @Value("${spring.redis.timeOut:10000}")
    private int timeOut;
    /*
    <bean id = "redisUtil" class="com.atguigu.gmall0311.config.RedisUtil">
    </bean>
     */
    /*
        2.  将RedisUtil 放入到spring 容器中管理
     */
    @Bean
    public  RedisUtil getRedisUtil(){
        // 如果没有host 则返回一个空对象
        if("disabled".equals(host)){
            return null;
        }
        RedisUtil redisUtil = new RedisUtil();
        // 初始化连接池工厂
        redisUtil.initJedisPool(host,port,timeOut);
        return redisUtil;
    }

}
