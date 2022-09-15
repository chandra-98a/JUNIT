package com.assignment.question3;

import static org.junit.Assert.assertThrows;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.function.ThrowingRunnable;
class BankAccountTest {

	@Test(expected=InsufficientFundsException.class)
public	void testWithdraw() {
		int amount=0;
		BankAccount bankAccount=new BankAccount();
		bankAccount.withdraw(amount);
	
		
	
	}z
	
}
