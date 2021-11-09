package com.bae.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BankAccount {
		
	private double accNo;
	private String firstName; 
	private String lastName;
	private Date dateOpened;
	private double accBalance;
	private static int numberOfAccounts;
	
	SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
	static Date date = new Date(System.currentTimeMillis());
	
	public BankAccount(String firstName, String lastName,  double accBalance) {
		super();
		accNo = (Math.random()*100000);
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOpened = date;
		this.accBalance = accBalance;
		numberOfAccounts ++;
	}

	public double getAccNo() {
		return accNo;
	}
	 
	public double deposit(int deposit) {
		accBalance = this.accBalance + deposit;
		return accBalance;
		
	}
	
	 public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public static void setNumberOfAccounts(int newNumberOfAccounts) {
		 BankAccount.numberOfAccounts = newNumberOfAccounts;
	 }


	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOpened="
				+ dateOpened + ", accBalance=£" + accBalance + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOpened() {
		return dateOpened;
	}


	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}


	

}
