package com.globant.poc.config;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class OrderApplicationConfig {

	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }
	
	public static void main(String[] args) {
		//Custom Config file name for the application. By 
		//By default Spring Boot applications look for an application.properties
		//or application.yml file for configuration.
		//Here it will check for orders-config.yml or orders-config.properties
		System.setProperty("spring.config.name", "orders-config");
		
		SpringApplication.run(OrderApplicationConfig.class, args);

	}

}
