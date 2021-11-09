package com.bae.project;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu {
	
	public static void slowPrint(String output) {
		for (int i=0; i<output.length(); i ++) {
			char c = output.charAt(i);
			System.out.print(c);
			try {
				TimeUnit.MILLISECONDS.sleep(50);
			} catch (Exception e) {
				
			}
		} System.out.println(" ");
	
	}
	
	public static void calculatorScanner() {
	Scanner scan = new Scanner(System.in);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~~ Welcome to the Calculator app ~~~~~~~~~~~");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~ Are you ready to do some maths?! ~~~~~~~~~");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println(" ");
	System.out.println(" ");
	slowPrint("What would you like to do?");
	
	slowPrint("\t For addition, select 1 ");
	slowPrint("\t For subtraction, select 2 ");
	slowPrint("\t For multiplication, select 3 ");
	slowPrint("\t For division, select 4 ");
	slowPrint("\t To square a number, select 5 ");
	slowPrint("\t To cube a number, select 6 ");
	slowPrint("\t To find the square root of a number, select 7 ");
	slowPrint("\t If you've changed your mind, and you don't want to do maths! select 0 ");
	slowPrint(" ");
	slowPrint(" ");
	
	int answer = scan.nextInt(); 
	
	Boolean menuFlag = true;
	switch(answer) {
	case 1:
		slowPrint("You have selected addition!");
		slowPrint("Please enter a number: ");
		float num1 = scan.nextFloat();
		slowPrint("Please enter another number: ");
		float num2 = scan.nextFloat();
		CalculatorScanner.addition(num1, num2);
		break;
	case 2:
		slowPrint("You have selected subtraction!");
		slowPrint("Please enter a number: ");
		float num3 = scan.nextFloat();
		slowPrint("Please enter another number: ");
		float num4 = scan.nextFloat();
		CalculatorScanner.subtraction(num3, num4);
		break;
	case 3:
		slowPrint("You have selected multiplication!");
		slowPrint("Please enter a number: ");
		float num5 = scan.nextFloat();
		slowPrint("Please enter another number: ");
		float num6 = scan.nextFloat();
		CalculatorScanner.multiplication(num5, num6);
		break;
	case 4:
		slowPrint("You have selected division!");
		slowPrint("Please enter a number: ");
		float num9 = scan.nextFloat();
		System.out.println("Please enter another number: ");
		float num10 = scan.nextFloat();
		CalculatorScanner.division(num9, num10);
		break;
	case 5:
		slowPrint("You have selected squaring!");
		slowPrint("Please enter a number: ");
		float num11 = scan.nextFloat();
		CalculatorScanner.square(num11);
		break;
	case 6:
		slowPrint("You have selected cubing!");
		slowPrint("Please enter a number: ");
		float num12 = scan.nextFloat();
		CalculatorScanner.cube(num12);
		break;
	case 7:
		slowPrint("You have selected finding the square root!");
		slowPrint("Please enter a number: ");
		double num13 = scan.nextDouble();
		CalculatorScanner.squareRoot(num13);
		break;
	case 0:
		slowPrint("You have decided maths is not your thing!");
		slowPrint("Bye!!");
		menuFlag = false;
	default:
		slowPrint("I didn't get that, please try again!");
		
		
	}

	
	}
}
