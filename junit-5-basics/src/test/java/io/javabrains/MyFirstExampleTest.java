package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;


class MyFirstExampleTest {
	MyFirstExample myFirstExample;
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This needs to run before all");
	}
	
	//@AfterAll
	//static void afterAllInit() {
		//System.out.println("This needs to run before all");
	//}
	TestInfo testInfo;
	TestReporter testReporter;
	@BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo=testInfo;
		this.testReporter=testReporter;
		myFirstExample=new MyFirstExample();
    }
	@AfterEach
	void cleanUp()
	{
		System.out.println("Cleaning up .........");
	}
	//@Test
	//@EnabledOnOs(OS.LINUX)
	//void testMul() {
	//	
		//int expected =2;
	//	int actual=myFirstExample.multiply(2,1);
	//	assertEquals(expected,actual,"multiply 2 numbers");
	//}
	
	@Test
	@DisplayName("testing add method")
	@Tag(value = "Math")
	void testAdd() {
		
		int expected =3;
		int actual=myFirstExample.add(2,1);
		assertEquals(expected,actual,"adding 2 numbers");
	}
	

	@RepeatedTest(value = 4)
	void testDevide() {
		boolean isServerUp=false;
		assumeTrue(isServerUp);
		assertThrows(ArithmeticException.class,  () -> myFirstExample.divide(1, 0),"divide by zero");
	}
	@Disabled
	@Test
	void disabledMethod() {
		System.out.println("method is disabling now");
	}
@Test
@DisplayName("Multiply method")
void testMultiply() {
	System.out.println("Running"+testInfo.getDisplayName()+"with tags"+testInfo.getTags());
	assertAll(
		()->assertEquals(4,myFirstExample.multiply(2,2)),
         ()->assertEquals(0,myFirstExample.multiply(0,2)),
         ()->assertEquals(-2,myFirstExample.multiply(-1,2))
        		 );
}
@Tag("Math")
@Nested
class NestedClass{
@Test
@Tag("Circle")
void addPositiveNumber() {
	assertEquals(4,myFirstExample.add(2, 2),"adding positive numbers");
}
@Test
void addNegativeNumber() {
	int expected=-2;
	int actual=myFirstExample.add(-4, 2);
	boolean isServerUp=true;
	assertTrue(isServerUp);
			assertEquals(expected,actual,()->"adding negative numbers is to return"+expected+"but returned"+actual);
}
}
}
