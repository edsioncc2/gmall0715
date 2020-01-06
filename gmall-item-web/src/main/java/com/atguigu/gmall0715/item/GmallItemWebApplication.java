package com.atguigu.gmall0715.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//页面资源导入 readis用
@ComponentScan(basePackages = "com.atguigu.gmall0715")
public class GmallItemWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallItemWebApplication.class, args);
	}

}
