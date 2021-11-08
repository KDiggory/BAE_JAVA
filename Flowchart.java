package com.bae.exercises;

public class Flowchart {

	public static void check(int num1, int num2, boolean bool) {

		if (bool) {
			int answer = num1 + num2;
			System.out.println("The sum of " + num1 + " and " + num2 + " = " + answer);
		} else if (bool == false) {
			int answerF = num1 * num2;
			System.out.println("The result of multiplying " + num1 + " and " + num2 + " = " + answerF);
		} else {
			System.out.println("Thats not something I can do");
		}
	}

	public static void theMethod(int A) {

		if (A > 2000) {
			System.out.println("1");
			if (A > 100) {
				System.out.println("3");
				if (A > 600) {
					System.out.println("5");
					System.out.println("End");
				} else {
					System.out.println("4");
					if (A > 500) {
						System.out.println("6");
						System.out.println("End");
					} else {
						System.out.println("7");
						System.out.println("End");
					}
				}
			} else {
				System.out.println("2");
				System.out.println("End");
			}
		} else {
			System.out.println("A");
		}
		if (A > 6000) {
			System.out.println("C");
			System.out.println("End");
		} else {
			System.out.println("B");
			if (A > 4000) {
				System.out.println("D");
				System.out.println("End");
			} else {
				System.out.println("E");
				System.out.println("End");
			}
		}

	}

	public static void main(String[] args) {
		theMethod(500);
		check(1, 2, true);

	}
}