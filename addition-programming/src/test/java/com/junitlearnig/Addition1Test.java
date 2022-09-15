package com.junitlearnig;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Addition1Test {

	@Test
	
	void testadd() {
		Addition1 ad=new Addition1();
		int expected=2;
		int actual=ad.add(1,1);
		assertEquals(expected, actual,"this should add two numbers");
		
	}

}
