package com.securitybasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.securitybasic.controller"),@ComponentScan("com.securitybasic.config") })
public class Securitybasic2Application {

	public static void main(String[] args) {
		SpringApplication.run(Securitybasic2Application.class, args);
	}

}
