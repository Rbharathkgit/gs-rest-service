package com.example.service;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class GreetingAspect {

	  @Before("execution(* Student.getName(..))") 
    public void logBeforeV1()
    {
        System.out.println("EmployeeCRUDAspect.logBeforeV1() : ");
    }
}
