package org.skcorg.demo.boot.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client")
public interface GreetingClient {
	@RequestMapping("/greeting")
	String greeting();
}