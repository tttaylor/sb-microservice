package com.tenkode.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbMicroserviceApplication {

	public static void main(String[] args) {
		System.out.println("Just printing something here.");
		SpringApplication.run(SbMicroserviceApplication.class, args);
	}
}
