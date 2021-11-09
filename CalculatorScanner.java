package com.bae.project;

public class CalculatorScanner {
	
	public static void addition(float num1, float num2) {
		Menu.slowPrint(num1 + " + " + num2 + " = " + (num1+num2));
		
	}
	
	public static void subtraction(float num1, float num2) {
		Menu.slowPrint(num1 + " - " + num2 + " = " + (num1-num2));
		
	}
	
	public static void multiplication(float num1, float num2) {
		Menu.slowPrint(num1 + " * " + num2 + " = " + (num1*num2));
		
	}
	public static void division(float num1, float num2) {
		Menu.slowPrint(num1 + " / " + num2 + " = " + (num1/num2));
		
	}
	public static void square(float num1) {
		Menu.slowPrint(num1 + " squared = " + (num1*num1));
		
	}
	public static void cube(float num1) {
		Menu.slowPrint(num1 + " cubed = " + (num1*num1*num1));
		
	}
	public static void squareRoot(double num1) {
		Menu.slowPrint("The square root of " + num1 + " = " + (Math.sqrt(num1)));
	
		
	}
	
	
}
