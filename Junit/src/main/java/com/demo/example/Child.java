package com.demo.example;

public class Child implements I1,I2 {
	@Override
	public void demo1()
	{
		//TODO Auto-generated method stub
		I1.super.demo1();
		I2.super.demo1();
	}

}
