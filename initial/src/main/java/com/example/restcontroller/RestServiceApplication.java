package com.example.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example","com.example.repo"})
@EnableAutoConfiguration
@EnableAspectJAutoProxy
@EnableJpaRepositories("com.example.repo")
@EntityScan("com.example.entity")
public class RestServiceApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(RestServiceApplication.class,args);

  }
}
