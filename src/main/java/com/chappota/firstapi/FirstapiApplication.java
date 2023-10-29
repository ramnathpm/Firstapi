package com.chappota.firstapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstapiApplication {

	public static void main(String[] args) {
		System.out.println("I am inside");
		SpringApplication.run(FirstapiApplication.class, args);
	}

}
