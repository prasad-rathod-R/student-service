package com.ms.app.studentservice.feignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.app.studentservice.response.AddressResponse;

@FeignClient(value = "address-service",
		path = "/api/address")
public interface AddressFeignClient {
	
@GetMapping("/getById/{id}")
	public AddressResponse getById(@PathVariable long id);

}