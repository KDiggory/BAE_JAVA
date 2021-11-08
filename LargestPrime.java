package com.bae.iteration;

import java.util.ArrayList;
import java.util.List;

public class LargestPrime {
	public static int i;
	public static int m;
	public static boolean prime = true;
	public static int index = 0;
	public static List<Integer> allNums = new ArrayList<>();
	public static List<Integer> allPrimes = new ArrayList<>();
	public static List<Integer> notPrimes = new ArrayList<>();
	public static int lastPrime = 0;

	public static void checkPrime(int n) {
		int i; 
		int m;
		boolean prime = true;
		m = n / 2;
		if (n == 0 || n == 1) {
			//System.out.println(n + " is not prime number");
			notPrimes.add(n);
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					//System.out.println(n + " is not a prime number");
					notPrimes.add(n);
					prime = false;
					break;
				} 
			}
			if (prime == true) {
				//System.out.println(n + " is a prime number");
				allPrimes.add(n);
			}
		} 
		
	}

	public static void getBiggestPrimes(int n) { 
		List<Integer> allNums = new ArrayList<>();
		for(int i = 0; i < n; i++) {
		allNums.add(i); 
		}
		for(int i=0; i < allNums.size()+1 ; i++) {
			checkPrime(i);}
		getLast(allPrimes);
		
	}
	
	public static void getLast(List<Integer> allPrimes ) {
		index = allPrimes.size()-1;
		//System.out.println(index);
		lastPrime = allPrimes.get(index);
		System.out.println(lastPrime);
		
	}

	public static void main(String[] args) {
		getBiggestPrimes(10);
		getBiggestPrimes(17);
		getBiggestPrimes(175);
		//getBiggestPrimes(17542);
		getBiggestPrimes(1705);
		
	}

}

