package com.bae.exercises;

public class Calculator {
	
	
	public static void Addition(int num1, int num2) {
		int answer = num1 + num2;
		System.out.println(answer);
	}
	
	public static void Multiplication(int num1, int num2) {
		int answer = num1 * num2;
		System.out.println(answer);
	}
	public static void Subtraction(int num1, int num2) {
		int answer = num1 - num2;
		System.out.println(answer);
	}
	public static void Division(double num1, double num2) {
		if (num1 > num2) {
		double answer = num1 / num2;
		System.out.println(answer);
		} else {
			System.out.println("I only want to do easy division, give me numbers the other way round!");
		}
	}

	public static void main(String[] args) {
		Addition(6,1000);
		Multiplication(1,2);
		Subtraction(1,2);
		Division(1,2);

	}

}
