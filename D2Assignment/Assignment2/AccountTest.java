package com.manipal.demo;

public class AccountTest {
//accountNo, double accountBalance, String accountType, int accountCount
	public static void main(String[] args) {
		Account a = new Account(1001,20000.68,"Savings",5);
		//Account a = new Account(1001,20000.68,"Current",5);
		a.depositAmount(300);
		a.getAccountDetails();
	}}
