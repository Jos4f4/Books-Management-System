package com.project.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BooksManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksManagementSystemApplication.class, args);
	}

}
