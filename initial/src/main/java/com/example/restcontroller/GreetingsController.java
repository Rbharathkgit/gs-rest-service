package com.example.restcontroller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.GreetingsService;
import com.example.vo.Greeting;
import com.example.vo.Student;
import com.example.vo.example;

@RestController
public class GreetingsController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	//@Autowired
	private Student aStud;
	@Autowired
	private GreetingsService aGreet;

	
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		//aa a = new aa(); Instead of
		//return new Greeting(counter.incrementAndGet(), String.format(template, name),String.format(template, name));
		return aGreet.fetchGreet();
	}
	
	@GetMapping("/example")
	public example getexam(@RequestParam(value = "name", defaultValue = "World") String name) {
		example a = new example();
		a.setStr("really");
		return aGreet.fetchSing();
	}
	
	@GetMapping("/student")
	public Student student(@RequestParam(value = "name", defaultValue = "Arnav BK") String name,@RequestParam(value = "age", defaultValue = "9") String age) {
		//return new Greeting(counter.incrementAndGet(), String.format(template, name),String.format(template, name));
		
		Student aStud = new Student();
		
		aStud.setName(name);
		aStud.setAge(Integer.parseInt(age));
		aStud.setRegistrationNumber("1028181");
		return aStud;
	}

/*	@GetMapping("/student")
	public Student student(@RequestParam(value = "name", defaultValue = "Arnav BK") String name,@RequestParam(value = "age", defaultValue = "9") String age) {
		//return new Greeting(counter.incrementAndGet(), String.format(template, name),String.format(template, name));
		StudentRegistration aStudRg;
		aStudRg.getInstance();
		
		aStud.setName(name);
		aStud.setAge(Integer.parseInt(age));
		aStud.setRegistrationNumber("1028181");
		return aStud;
	}
*/
	@PostMapping("/student/save")
	public Student stud2(@RequestBody Student aStud) 
	{
		//Student aStud = new Student();
		
		aStud.setId(1000);
		
		return aStud;
	}
	
	
	
}