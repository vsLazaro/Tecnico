package com.camisnew.web_exemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebExempleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebExempleApplication.class, args);

		System.out.println("Exemplo com spring agora com REST. Veja em localhost:8080 ");
	}

}
