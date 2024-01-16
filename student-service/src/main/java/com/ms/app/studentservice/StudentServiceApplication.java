package com.ms.app.studentservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class StudentServiceApplication {
	@Value("${address.service.url}")
	private String addressServiceUrl;
	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}
	
}
