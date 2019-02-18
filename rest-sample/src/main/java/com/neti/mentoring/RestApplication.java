package com.neti.mentoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

// tartalmazza: @Configuration, @EnableAutoConfiguration, @ComponentScan
// @EnableAutoConfiguration: a classpath es a definialt bean-ek alapjan automatikusan felveszi a hianyzo bean-eket a spring context-be
// @ComponentScan: az adott package-ben es az alatta levokben minden annotalt komponenst felsziv

@SpringBootApplication
public class RestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
