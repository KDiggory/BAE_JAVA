package com.bae.exercises;

public class Taxes {
	
	public static int tax;

	public static void methodOne(int pay) {
		if (pay > 45000) {
			tax = 25;		
		} else if (pay > 30000) {
			tax = 20;	
		} else if (pay > 20000) {
			tax = 15;	
		} else if (pay > 15000) {
			tax = 10;	
		} else {
			tax = 0;
		}
		System.out.println("Your salary is in the " + tax + "% tax band.");
		
	}
	
	public static void methodTwo(int pay) {
		if (pay < 15000) {
			System.out.println("You are in the 0% tax band, on a salary of "+ pay +" per annum. You won't pay any tax");
		} else if ((pay > 1500) && (pay <20000 )) {
			int taxPay = pay - 15000;
			int amountTaxed = taxPay - (taxPay/100)*90;
			int totalPerc = ((taxPay/pay)*100);
			System.out.println("You are in the 10% tax band, on a salary of £" + pay +" per annum you won't pay any tax on the first 15000, \nyou will pay £" + 
			amountTaxed + " on the remaining £" + taxPay + " which is " + totalPerc + "% of your yearly salary.");
		} else if ((pay > 20000) && (pay <30000 )) {
			int taxPay = pay - 15000;
			int taxPay15 = taxPay-5000;
			int amountTaxed10 = taxPay - (taxPay/100)*90;
			int amountTaxed15 = taxPay15 - (taxPay15/100)*85;
			int total = amountTaxed10 + amountTaxed15 ;
			int totalPerc = ((total/pay)*100);
			System.out.println("You are in the 15% tax band, on a salary of £" + pay +" per annum you won't pay any tax on the first £15000, \nyou will pay £" + 
			amountTaxed10 + " on £" + taxPay + " and a further £" +  amountTaxed15 + " on the remaining £" + taxPay15
			+ "\nThis is a total of £" + total + " which is " + totalPerc + "% of your yearly salary.");
		} else if ((pay > 30000) && (pay <45000 )) {
			int taxPay = pay - 15000;
			int taxPay15 = taxPay-5000;
			int taxPay20 = taxPay15 - 1000;
			int amountTaxed10 = taxPay - (taxPay/100)*90;
			int amountTaxed15 = taxPay15 - (taxPay15/100)*85;
			int amountTaxed20 = taxPay20 - (taxPay15/100)*80;
			int total = amountTaxed10 + amountTaxed15 +amountTaxed20 ;
			int totalPerc = ((total/pay)*100);
			System.out.println("You are in the 25% tax band, on a salary of £" + pay +" per annum you won't pay any tax on the first 15000, \nyou will pay £" + 
			amountTaxed10 + " on £" + taxPay + ", \n£" +  amountTaxed15 + " on £" + taxPay15 + " \nand £" + amountTaxed20+ " on the remaining £" + taxPay20
			+ "\nThis is a total of £" + total + " which is " + totalPerc + "% of your yearly salary."); 
			} else if (pay > 45000) {
			int taxPay = pay - 15000;
			int taxPay15 = taxPay-5000;
			int taxPay20 = taxPay15 - 10000;
			int taxPay25 = taxPay20 - 15000;
			int amountTaxed10 = taxPay - (taxPay/100)*90;
			int amountTaxed15 = taxPay15 - (taxPay15/100)*85;
			int amountTaxed20 = taxPay20 - (taxPay20/100)*80;
			int amountTaxed25 = taxPay25 - (taxPay25/100)*75;
			int total = amountTaxed10 + amountTaxed15 +amountTaxed20 +amountTaxed25;
			int totalPerc = ((100*total)/pay);
			System.out.println("You are in the 25% tax band, on a salary of £" + pay +" per annum you won't pay any tax on the first 15000, \nyou will pay £" + 
			amountTaxed10 + " on £" + taxPay + ", \n£" +  amountTaxed15 + " on £" + taxPay15 + ", \n£" + amountTaxed20+ " on £" + taxPay20 + 
			" \nand £" + amountTaxed25+" on the remaining £" + taxPay25 + ".\nThis is a total of £" + total + " which is " + totalPerc + "% of your yearly salary."); }
		
		
	}
		
		
	
	
	
	public static void main(String[] args) {
		methodTwo(56000);
		

	}

}
