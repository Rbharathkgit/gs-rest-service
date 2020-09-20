package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repo.StudentRepo;
import com.example.vo.Greeting;
import com.example.vo.example;

@Service
public class GreetingsService {
	
	public Greeting fetchGreet()
	{
		Greeting aGreet = new Greeting(10,"Thanks","BK");
		
		return aGreet;
		
	}
	
	public example fetchSing()
	{
		example aexam = new example();
		
		return aexam.singExample();
		
	}
	
}
