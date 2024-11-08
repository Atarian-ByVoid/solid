package com.beto.solid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.beto.solid.logs.repository")
@EnableJpaRepositories(basePackages = "com.beto.solid.infra.repository")
@SpringBootApplication
public class SolidApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolidApplication.class, args);
	}

}
