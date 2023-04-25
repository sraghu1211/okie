package com.ragu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableCaching
@OpenAPIDefinition(info=@Info(title="Employee API",version="3.0.2",description="EMPLOYEE INFORMATION"))
public class Restapi1Application {

	public static void main(String[] args) {
		SpringApplication.run(Restapi1Application.class, args);
	}

}
