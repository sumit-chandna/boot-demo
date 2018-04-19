package org.skcorg.demo.boot.controller;

import org.skcorg.demo.boot.client.GreetingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Autowired
	private GreetingClient greetingClient;

	@RequestMapping("/get-greeting")
	public String greeting(Model model) {
		model.addAttribute("greeting", greetingClient.greeting());
		return "greeting-view";
	}
}
