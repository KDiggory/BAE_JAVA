package com.bae.oop;


public class BankRunner {
	
	

	public static void main(String[] args) {
		BankAccount accountOne = new BankAccount("Katie", "Diggory", 14000d );
		BankAccount accountTwo = new BankAccount("George", "Diggory", 8700d );
		BankAccount accountThree = new BankAccount("Valentine", "Dog", 50d );
		BankAccount accountFour = new BankAccount("Sherman", "Dog", 40.5631d );
		//System.out.println(accountOne.getDateOpened());
		//accountOne.setAccBalance(5000000d);
		//System.out.println(accountOne.getAccBalance());
		//System.out.println(accountOne.toString());
		//System.out.println(accountTwo.toString());
		
		int accounts = BankAccount.getNumberOfAccounts();
		System.out.println(accounts);
		
		accountTwo.deposit(1000);
		System.out.println(accountTwo.getAccBalance());
		
		
	}

}
