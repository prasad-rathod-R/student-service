package com.ms.app.studentservice.feignClients;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

import feign.Feign;

@LoadBalancerClient(value = "address-service")
public class AddressLoadBalancer {

	@LoadBalanced
	@Bean
	public Feign.Builder feignBulder(){
		return Feign.builder();
		
	}
}
