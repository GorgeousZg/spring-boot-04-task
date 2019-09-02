package com.atguigu.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableAsync //开启异步注解
@EnableScheduling //开启基于注解的定时任务
@SpringBootApplication
public class SpringBoot04TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot04TaskApplication.class, args);
	}

}
