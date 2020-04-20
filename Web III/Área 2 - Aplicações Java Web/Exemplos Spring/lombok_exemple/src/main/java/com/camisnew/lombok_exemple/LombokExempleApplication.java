package com.camisnew.lombok_exemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokExempleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokExempleApplication.class, args);
		System.out.println("Running... check localhost:8080");
	}
}
