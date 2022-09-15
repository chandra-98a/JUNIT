package com.assignment.question4;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
 public class JUnitTestTest {
	 
	 
@BeforeEach
public void init() {
	JUnitTest junitTest=new JUnitTest();
}
@BeforeAll
@Test
public  void beforeAllExecution() {
	System.out.println("I am here");
}
@Test 
public void testAdd() {
	JUnitTest junitTest=new JUnitTest();
	int expected=2;
	int actual=junitTest.add(1, 1);
	assertEquals(expected,actual,"this is output");
}



@AfterAll
	@Test
	public void test() {
		System.out.print("hello");
	}

	

}
