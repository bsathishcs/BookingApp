package com.example.bookingSite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication()
@EnableJpaRepositories (basePackages = "com.example.bookingSite.repository")
@ComponentScan(basePackages = "com.example.*")
@EntityScan (basePackages = "com.example.bookingSite.model")

public class BookingSiteApplication {

	public static void main(String[] args) {

        SpringApplication.run(BookingSiteApplication.class, args);
	}

}
