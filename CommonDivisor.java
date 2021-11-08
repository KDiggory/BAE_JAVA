package com.bae.exercises;

import java.util.ArrayList;

public class CommonDivisor {
	
	// return the lowest common demonimator 
	
	public static ArrayList<Integer> denom = new ArrayList<>();
	
	public static void Divisor(int p, int q) {
		for (int i = 1; (i <= q)||(i <=p); i++) {
			if ((p% i == 0) && (q% i == 0)) {
				denom.add(i);
			}
		} 		
		int size = denom.size();
		int lowestDenom = denom.get(size-1);
		System.out.println(lowestDenom);
	}

	public static void main(String[] args) {
		Divisor(99,81);
	}

}

