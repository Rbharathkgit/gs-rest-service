package com.example.restcontroller;

class M
{
	public static int i;
	{
		System.out.println("Printing from initializer");
		// Final i = 10;
	}
	 public static void main(String args[]) 
	    { 
	      
	        Singleton x = Singleton.getInstance(); 
	  
	        // instantiating Singleton class with variable y 
	        Singleton y = Singleton.getInstance(); 
	  
	        // instantiating Singleton class with variable z 
	        Singleton z = Singleton.getInstance(); 
	  
	        // changing variable of instance x 
	      //  x.a = (x.a).toUpperCase(); 
	  
	        System.out.println("String from x is " + x.aa); 
	        System.out.println("String from y is " + y.aa); 
	        System.out.println("String from z is " + z.aa); 
	        System.out.println("\n Initialized I---"+i); 
	  
	        // changing variable of instance z 
	       // z.a = (z.a).toLowerCase(); 
	  
	        System.out.println("String from x is " + x.a); 
	        System.out.println("String from y is " + y.a); 
	        System.out.println("String from z is " + z.a); 
	    } 
	 
	 static {
	 i = 100;
	 }
	 
	 public String cons1()
	 {
		 return "Constructor1";
		
	 }
	 public String cons1(int i)
	 {
		 return "Constructor1"+i;
		
	 }
}
