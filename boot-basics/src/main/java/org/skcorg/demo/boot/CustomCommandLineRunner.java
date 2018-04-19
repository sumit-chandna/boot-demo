package org.skcorg.demo.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomCommandLineRunner implements CommandLineRunner {

	@Value("${name}")
	private String name;

	public void run(String... args) {
		System.out.println("application started..........!!!" + name);
	}

}