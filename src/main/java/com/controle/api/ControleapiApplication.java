package com.controle.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.controle.api.config.property.ControleapiProperty;

@SpringBootApplication
@EnableConfigurationProperties(ControleapiProperty.class)
public class ControleapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleapiApplication.class, args);
	}

}
