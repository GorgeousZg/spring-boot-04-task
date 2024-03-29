package com.atguigu.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
	/**
	 * second(秒) ,minute(分), hour(时), day of month(日), month(月)  day of week(周几)
	 */
	@Scheduled(cron = "0 * * * * SUN")
	public void hello() {
		System.out.println("hello");
	}
}
