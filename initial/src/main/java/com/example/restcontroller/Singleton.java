package com.example.restcontroller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Singleton {

	private static Singleton sing = null;
	
	public String a;
	public String aa;
	
	private Singleton()
	{
		a = "testing";
		}
	
	private Singleton(String i)
	{
		aa = i;
		}
	
	@Bean
	@Scope("singleton")
	public static Singleton getInstance()
	{
		if (sing == null)
			sing = new Singleton();
				
		return sing;
	}
}

