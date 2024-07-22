package com.demo.example;

public class DemoTest {
	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getName());
		Data d1=new Data();
		Data d2=new Data();
		Data d3=new Data();
        Data d4=new Data();

		d1.start();
	//d1.start();
	
		d2.start();
		
		d3.start();
		
		d4.start();
	}
	}
	
	//Multiple threading eg
	//interface is more imp than class