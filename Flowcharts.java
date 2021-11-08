package com.bae.iteration;

public class Flowcharts {

	public static void flowchartOne() {
		for (int A = 100; A <= 200; A++) {
			System.out.println(A);
		}
		System.out.println("End");
	}

	public static void flowchartTwo() {
		for (int A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}

	public static void methodThree() {
		int times = 0;
		do {
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + " ");
			}
			times++;
			System.out.println(" ");
		} while (times <= 10);
	}

	public static void methodFour() {
		for ( int i = 1; i <=10; i ++ ) {
		for ( int j = 1; j <=i; j++) {
			System.out.print(j + " ");
		}  System.out.println(" ");
		}
	}
	
	public static void methodFourAgain() {
		for ( int i = 1; i <=10; i ++ ) {
		for ( int j = 1; j <=i; j++) {
			System.out.print(i + " ");
		}  System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		flowchartOne();
		flowchartTwo();
		methodThree();
		methodFour();
		methodFourAgain();

	}

}
