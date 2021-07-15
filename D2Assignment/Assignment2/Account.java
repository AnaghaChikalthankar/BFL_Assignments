package com.manipal.demo;

public class Account {
	private int accountNo; 
	private double accountBalance; 
	private String accountType;
	private int accountCount;
	public Account(int accountNo, double accountBalance, String accountType, int accountCount) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
		this.accountCount = accountCount;
	}
	void depositAmount(double amount) {
		accountBalance = accountBalance+amount;
		System.out.println("Account balace: "+accountBalance);
	}
	void getAccountDetails() {
		System.out.println("Account details: "+accountNo+"\n"+accountBalance+"\n"+accountType+"\n"+accountCount);
	}
	 
	

}
