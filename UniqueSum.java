package com.bae.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class UniqueSum {

	public static int num1;
	public static int num2;
	public static int num3;
	public static List<Integer> nums = new ArrayList<>();
	public static List<Integer> numbersToAdd = new ArrayList<>();


	public static void unique(int num1, int num2, int num3) {
		nums.add(num1);
		nums.add(num2);
		nums.add(num3);
		
		System.out.println(nums);
		int duplicate0 = Collections.frequency(nums, nums.get(0));
		int duplicate1 = Collections.frequency(nums, nums.get(1));
		int duplicate2 = Collections.frequency(nums, nums.get(2));
				if (duplicate0 == 1) {	
				numbersToAdd.add(nums.get(0));
			} if (duplicate1 == 1) {	
				numbersToAdd.add(nums.get(1));
			} if (duplicate2 == 1) {	
				numbersToAdd.add(nums.get(2));
			}
		finalSums(numbersToAdd);
	}



	public static void finalSums(List<Integer> numbersToAdd) {
		int sum = 0;
		for (int i = 0; i < numbersToAdd.size(); i++) {   
	           sum = sum + numbersToAdd.get(i);  
	        }    
	        System.out.println("Sum of all the unique elements in the array: " + sum); 
	        nums.clear();
	        numbersToAdd.clear();
	    }  
	  
	

	public static void main(String[] args) {
		unique(5,5,6);
		unique(6, 6, 6);
		unique(17,99,1235);
		

	}

}
