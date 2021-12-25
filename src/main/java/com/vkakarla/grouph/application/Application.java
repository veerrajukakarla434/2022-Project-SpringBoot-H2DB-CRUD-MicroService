package com.vkakarla.grouph.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(info = @Info(title = "Employee Project", version = "0.0.1-SNAPSHOT", description = "Employee Service Operations", termsOfService = "vkakarla java springboot service", contact = @Contact(name = "vkakarl", email = "vkakarla1985@gmail.com"), license = @License(name = "vkakarla", url = "http://youtube.com/vkakarla")))
@ComponentScan(value = "com.vkakarla.grouph")
@EnableJpaRepositories(basePackages = { "com.vkakarla.grouph.repository" })
@EntityScan(basePackages = { "com.vkakarla.grouph.entities" })
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
