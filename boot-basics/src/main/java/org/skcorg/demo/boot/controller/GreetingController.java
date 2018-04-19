package org.skcorg.demo.boot.controller;

import org.skcorg.demo.boot.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
	@Autowired
	private GreetingService greetingService;

	@RequestMapping("/greeting")
	public @ResponseBody String greeting() {
		return greetingService.greet();
	}

}