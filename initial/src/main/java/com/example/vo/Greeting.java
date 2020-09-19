package com.example.vo;

public class Greeting {

	private final long id;
	private final String content;
	private final String name;

	public Greeting(long id, String content,String naml) {
		this.id = id;
		this.content = content;
		this.name = naml;
		example b = new example();
		System.out.println("Overwritten--"+b.getStr());

		b.setStr("Overwritten");
		System.out.println("Overwritten"+b.getStr());
	}
	
	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	
	public String getName() {
		return name;
	}
}