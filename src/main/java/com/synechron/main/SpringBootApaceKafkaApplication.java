package com.synechron.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.synechron.*")
public class SpringBootApaceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApaceKafkaApplication.class, args);
	}

}
