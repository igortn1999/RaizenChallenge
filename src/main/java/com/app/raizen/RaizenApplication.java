package com.app.raizen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.app.raizen")
@EnableJpaRepositories("com.app.raizen.mvc.model.repositories")
public class RaizenApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaizenApplication.class, args);
	}

}