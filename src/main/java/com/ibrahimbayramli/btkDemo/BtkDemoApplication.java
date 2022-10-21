package com.ibrahimbayramli.btkDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class BtkDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BtkDemoApplication.class, args);
	}

}
