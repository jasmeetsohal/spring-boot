package com.hacktober.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationMain {

	public static void main(String[] args) {
		System.out.println("Starting the application......");
		SpringApplication.run(ApplicationMain.class, args);
		
	}

}
