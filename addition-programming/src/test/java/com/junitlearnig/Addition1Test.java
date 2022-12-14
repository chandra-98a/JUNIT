package com.junitlearnig;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
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
	
	TestInfo testInfo;
	TestReporter testReporter;
	@BeforeEach
	void init(TestInfo testInfo,TestReporter testReporter) {
		this.testReporter= testReporter;
		this.testInfo=testInfo;
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
		int expected=2;
		int actual=ad.add(1, 1);
		assertEquals(expected,actual,"should return positive result"+expected+"but return"+actual);
	}
	@Test
	@DisplayName("Negetive")
	void testAddNegetive() {
		assertEquals(-2,ad.add(-1, -1),"should return negative result");
	}
}
	@Tag("Math")
	@Test
	@DisplayName("testing multiply method")
	void testMultiply() {
		assertEquals(4,ad.multiply(2, 2));
		assertAll(
				()->assertEquals(6,ad.multiply(3, 2)),
				()->assertEquals(0,ad.multiply(1, 0)),
				()->assertEquals(1,ad.multiply(1, 1))
				);
		System.out.println("running"+testInfo.getDisplayName()+"with tags"+testInfo.getTags());
	}
	
	
	
	
	@Test
	@Tag("Math")
	@DisplayName("testing divide method")
	void testDivide() {
		boolean isServerUp=true;
		assumeTrue(isServerUp);
		assertThrows(ArithmeticException.class,()->ad.divide(1, 0),"divide by zero should be thrown");
	}
	
	@Test
	@Tag("Circle")
	@RepeatedTest(3)
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
