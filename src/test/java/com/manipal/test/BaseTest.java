package com.manipal.test;

import java.util.Date;

import org.testng.annotations.Test;

public class BaseTest {
	
	@Test
	public void test()
	{
		System.out.println("-----------------------------------");
		System.out.println("Tested developed at "+new Date());
	}

}
