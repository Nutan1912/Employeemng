package com.demo.example;
@FunctionalInterface
public interface Testing {
	public void demo() ;
	static void data() {
		System.out.println("Hello");
	}
	default void pqr()
	{
	System.out.println("This is Testing interface");
	}
	}

	

