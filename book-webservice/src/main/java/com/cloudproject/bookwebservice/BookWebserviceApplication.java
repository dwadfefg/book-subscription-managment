package com.cloudproject.bookwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookWebserviceApplication.class, args);
	}

}
