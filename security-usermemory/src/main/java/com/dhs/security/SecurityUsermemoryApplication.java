package com.dhs.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.dhs.security.controller"), @ComponentScan("com.eazybytes.config")})
@EnableJpaRepositories("com.dhs.security.repository")
@EntityScan("com.dhs.security.model")
public class SecurityUsermemoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityUsermemoryApplication.class, args);
	}

}
