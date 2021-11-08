package com.bae.exercises;

import java.util.ArrayList;

public class PrimeNumber {

	public static void checkPrime(int n) {
		int i; 
		int m;
		boolean prime = true;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not a prime number");
					prime = false;
					break;
				} 
			}
			if (prime == true) {
				System.out.println(n + " is a prime number");
			}
		}  
	}

	public static void checkALLPrimes(int n) { 
		ArrayList<Integer> allNums = new ArrayList<>();
		for(int i = 0; i < n; i++) {
		allNums.add(i); 
		}
		for(int i=0; i < allNums.size()+1 ; i++) {
			checkPrime(i);}
	}

	public static void main(String[] args) {
		checkPrime(10);
		checkPrime(17);
		checkALLPrimes(17565);
	}

}
