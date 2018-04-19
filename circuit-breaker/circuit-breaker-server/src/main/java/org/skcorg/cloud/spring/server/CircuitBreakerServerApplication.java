package org.skcorg.cloud.spring.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CircuitBreakerServerApplication {

	@RequestMapping(value = "/recommended")
	  public String readingList(){
	    return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
	  }
	
	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerServerApplication.class, args);
	}
}
