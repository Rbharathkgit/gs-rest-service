package com.example.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
@EnableAutoConfiguration
@EnableAspectJAutoProxy
public class RestServiceApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(RestServiceApplication.class,args);

  }
}
