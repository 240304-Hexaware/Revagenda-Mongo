package com.revature.revagenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {
		"com.revature.revagenda.controllers",
		"com.revature.revagenda.services",
		"com.revature.revagenda.repositories"},
		exclude = {DataSourceAutoConfiguration.class})
public class RevagendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevagendaApplication.class, args);
	}

}
