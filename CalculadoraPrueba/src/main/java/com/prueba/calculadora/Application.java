package com.prueba.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableJpaAuditing
@OpenAPIDefinition(info = @Info(title = "Test Prueba Rebeca", version = "1.0", description = "Calculadora"))
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
	}

}





