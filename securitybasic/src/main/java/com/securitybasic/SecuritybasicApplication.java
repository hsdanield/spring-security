package com.securitybasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.securitybasic.controller")
public class SecuritybasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritybasicApplication.class, args);
	}

}
