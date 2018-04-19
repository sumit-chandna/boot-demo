package org.skcorg.demo.boot.service.impl;

import org.skcorg.demo.boot.properties.SkcProperties;
import org.skcorg.demo.boot.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
	@Autowired
	private SkcProperties skcProperties;

	@Override
	public String greet() {
		System.out.println(skcProperties.getSecurity().getUsername());
		return "Greeting";
	}

}
