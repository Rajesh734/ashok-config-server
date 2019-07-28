package com.sample.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableConfigServer
public class AshokConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AshokConfigServerApplication.class, args);
	}

}
