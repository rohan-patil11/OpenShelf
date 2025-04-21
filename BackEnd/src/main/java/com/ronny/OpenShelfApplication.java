package com.ronny;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class OpenShelfApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OpenShelfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("The App Has Started without any issue");
		
		for (String arg : args) {
			System.out.println("Argument: "+arg);
		}
	}
}
