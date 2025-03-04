package com.ronny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class OpenShelfApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenShelfApplication.class, args);
	}

}
