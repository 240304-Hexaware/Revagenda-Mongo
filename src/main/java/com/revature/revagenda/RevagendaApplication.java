package com.revature.revagenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {
		"com.revature.demomongospring.controllers",
		"com.revature.demomongospring.services",
		"com.revature.demomongospring.repositories"},
		exclude = {DataSourceAutoConfiguration.class})
public class RevagendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevagendaApplication.class, args);
	}

}
