package com.qa.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest1 {
	
	@Test
	public void sum() {
		int a = 20;
		int b = 10;
		int SUM = a+b;
		System.out.println(SUM);
	}
	@Test
	public void sub() {
		int a = 20;
		int b = 10;
		int SUB = a-b;
		System.out.println(SUB);
	}
	@Test
	public void multi() {
		int a = 20;
		int b = 10;
		int MULTI = a*b;
		System.out.println(MULTI);
	}
}
