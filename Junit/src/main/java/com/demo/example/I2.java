package com.demo.example;

public interface I2 {
	static void demo() {
		System.out.println("Hello I2");
	}
	default void demo1()
	{
		System.out.println("default I2");
	}


}
