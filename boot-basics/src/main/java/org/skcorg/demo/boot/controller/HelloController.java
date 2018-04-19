package org.skcorg.demo.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class HelloController {
	@Autowired
	InternalResourceViewResolver internalResourceViewResolver;

	@RequestMapping("/")
	String home() {
		return "index.html";
		
	}

	@RequestMapping("/redirect")
	String redirect() {
		return "redirect:data.html";
	}

}
