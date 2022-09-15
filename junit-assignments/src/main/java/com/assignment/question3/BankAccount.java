package com.assignment.question3;

public class BankAccount {
	private double balance;
	
public BankAccount(double balance) {
		super();
		this.balance = balance;
	}



public void withdraw(double amount )throws InsufficientFundsException {
	if(amount<=balance) {
		balance-=amount;
	}else {
		double newBalance=amount-balance;
		throw new InsufficientFundsException(newBalance);
	}
}
}
