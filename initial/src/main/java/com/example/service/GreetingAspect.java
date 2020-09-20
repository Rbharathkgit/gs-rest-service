package com.example.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Configuration
public class GreetingAspect {

/*	@Before("execution(* com.getName())")
    public void logBeforeV1()
    {
        System.out.println("EmployeeCRUDAspect.logBeforeV1() : ");
    }*/
}
