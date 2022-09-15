package com.assignment.question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	public MinMaxFinderTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	void test() {
		MinMaxFinder minMaxFinder=new MinMaxFinder();
	MinMaxFinder.findMinMax(new int[] {56,34,7,3,54,3,34,34,53},9);
	System.out.println(minMaxFinder.A1[0]);
		
	
	}

}
