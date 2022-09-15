package com.junitlearnig;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class  Addition1Test{
	Addition1 ad;
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This needs to run before all");
	}
	
	
	@BeforeEach
	void init() {
		ad=new Addition1();
	}


	@Test
	
	void testadd() {
		
		int expected=2;
		int actual=ad.add(1,1);
		assertEquals(expected, actual,"this should add two numbers");
		
	}
	
	@Test
	void testDivide() {
		
		assertThrows(ArithmeticException.class,()->ad.divide(1, 0),"divide by zero should be thrown");
	}
	
	@Test
	void testcomputeCircleArea() {
		
		assertEquals(314.1592653589793,ad.computeCircleArea(10),"should return right circle area");
	}
	@AfterEach
	void cleanUp()
	{
		System.out.println("Cleaning up .........");
	}
	@AfterAll
	static void afterAllCleanUp() {
		System.out.println("Cleaning up after all........");
	}
}
