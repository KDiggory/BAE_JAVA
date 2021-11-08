package com.bae.dayOne;

public class FizzBuzz {

	static int num = 1000;

	public static void Play() {
		for (int i = 1; i < num; i++) {
			if (((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0)) {
				System.out.println("FIZZ-BUZZ-BANG");
			} else if (((i % 3) == 0) && (i % 7) == 0) {
				System.out.println("FIZZ-BANG");
			} else if (((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0)) {
				System.out.println("BUZZ-BANG");
			} else if (((i % 3) == 0) && ((i % 5) == 0)) {
				System.out.println("FIZZ-BUZZ");
			}
			if ((i % 3) == 0) {
				System.out.println("FIZZ");
			}
			if ((i % 5) == 0) {
				System.out.println("BUZZ");
			} else if ((i % 7) == 0) {
				System.out.println("BANG");
			}
			else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Play();

	}

}
