package com.example.vo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("application")
public class example {

	String str;
	int i;
	
	public String getStr()
	{
		return str;
	}
	
	public void setStr(String s)
	{
		this.str = s;
	}
	
	public int geti()
	{
		return i;
	}
	public void seti(int j)
	{
		this.i = j;
	}
	
	

	public example singExample()
	{
		example a = new example();
		
		a.setStr("this is really");
		a.seti(10000000);
		return a;
	}

}
