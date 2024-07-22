package com.demo.example;

public interface I1 {
	static void demo() {
		System.out.println("Hello I1");
	}
	default void demo1()
	{
		System.out.println("default I1");
	}

}
