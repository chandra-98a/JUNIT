package com.junitlearnig;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@EnabledOnOs(OS.WINDOWS)
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
	@DisplayName("testing add method")
	void testadd() {
		int expected=2;
		int actual=ad.add(1,1);
		assertEquals(expected, actual,"this should add two numbers");
		
	}
	
	
	@Nested
	@DisplayName("add class")
    class AddTest{
	@Test
	@DisplayName("Positive")
	void testAddPositive() {
		assertEquals(2,ad.add(1, 1),"should return positive result");
	}
	@Test
	@DisplayName("Negetive")
	void testAddNegetive() {
		assertEquals(-2,ad.add(-1, -1),"should return negative result");
	}
}
	
	
	@Test
	@DisplayName("testing divide method")
	void testDivide() {
		boolean isServerUp=true;
		assumeTrue(isServerUp);
		assertThrows(ArithmeticException.class,()->ad.divide(1, 0),"divide by zero should be thrown");
	}
	
	@Test
	@DisplayName("computing circle area method")
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
	@Disabled
	@DisplayName("TDD method should not run")
	@Test
	void testDisabled() {
		fail("this test should be disabled");
	}
}
