package com.tushar;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest 
{
    
	static AppTest appTest;
	
	@BeforeClass
	public static void setUp() {
		
		System.out.println("code setup...");
		appTest=null;
	}
	
	@AfterClass
	public static void cleanUp() {
		
		System.out.println("code cleanup...");
		appTest=null;
	}
	
	@Test
	public void addTest() {
		
		App app= new App();
		
		int expected=100;
		
		int actual= app.add(50,50);
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void neg() {
		
		App app= new App();
		
		int expected=-20;
		
		int actual=app.add(-50, 30);
		
		assertEquals(expected,actual);
	}
}
