package com.aayush.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddServiceTest {

	@Test
	void test1() 
	{
		AddService as=new AddService();
		int exp=10;
		int actual=as.add(5, 5);
		assertEquals(exp,actual);
		
	}
	@Test
	void test2() 
	{
		AddService as=new AddService();
		int exp=20;
		int actual=as.prod(5, 5);
		assertEquals(exp,actual);
		
	}
	@Test
	void test3() 
	{
		AddService as=new AddService();
		double exp=1;
		double actual=as.div(5, 5);
		assertEquals(exp,actual);
		
	}
	@Test
	void test4() 
	{
		AddService as=new AddService();
		int exp=0;
		int actual=as.sub(5, 5);
		assertEquals(exp,actual);
		
	}

}
