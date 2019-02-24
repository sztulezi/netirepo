package com.neti.mentoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// tartalmazza: @Configuration, @EnableAutoConfiguration, @ComponentScan
// @EnableAutoConfiguration: a classpath es a definialt bean-ek alapjan automatikusan felveszi a hianyzo bean-eket a spring context-be
// @ComponentScan: az adott package-ben es az alatta levokben minden annotalt komponenst felsziv
// extends SpringBootServletInitializer: ahhoz, hogy war projektkent is tudjon futni

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
