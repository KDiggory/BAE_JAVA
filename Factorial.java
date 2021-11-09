package com.bae.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factorial {
	
	public static void findFactorial(int input) {
		Boolean atOne = false;
		int actualSum = 1;
		String sum = Integer.toString(input) + " + ";;
		while (!atOne) {
			System.out.println(input);
			actualSum = actualSum+input;
			input --;
			sum = sum + Integer.toString(input) + " + ";
			if (input == 1) {
				atOne = true;
				sum = sum.substring(0, sum.length() -2);
				sum = (sum + " = ");
			}
		} System.out.println(sum + actualSum);
	}
	
	public static int actualSum = 0;
	public static String sum = ""; 
	
	public static void findFactorialRecursive(int firstInput) {
		theRecursiveOne(firstInput);
		System.out.println(Integer.toString(firstInput)+ " + " + sum + actualSum);
		
	}
			
	public static void theRecursiveOne(int input) {	
		if (input >=1) {
			actualSum = actualSum + input;
			input --;
			sum = sum + Integer.toString(input) + " + ";
			theRecursiveOne(input);
			}
			if (input == 1) {
				sum = sum.substring(0, sum.length() -2);
				sum = (sum + "= ");
				}
				
			} 

	public static List<Integer> list = new ArrayList();
	public static List<Integer> oddList = new ArrayList();
	public static List<Integer> singleList = new ArrayList();
	
	public static void addToList(List<Integer> list){
		addToListRecursive(list);
				
	}
	public static void addToListRecursive(List<Integer> list){
		if (list.size() < 1000) {
		list.add((int) (Math.random()*1000));
		addToListRecursive(list);
		} 
			
		}
	
	
	
	public static void nthOddElement(List list, int n) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != null) {
				int number = (int) list.get(i);
				if (number%2 ==1) {
				oddList.add(number);
				} 
				}
		}
		System.out.println("The " + n + "th odd number is: " + oddList.get(n-1));
		}
	
	public static void linearSearch( List list, Integer n) {
		if (list.contains(n)) {
		System.out.println("That numnber is at index: " + list.indexOf(n));
		} else {
			System.out.println("The list doesn't contain that number");
		}
	}
	
	public static void findMax(List<Integer> list) {
		if (list.size() > 1) {
			System.out.println("The largest number is " + Collections.max(list));
		} else {
			System.out.println("There is only one number in the list: " + list.get(0));
		}
		
	}
	
	public static void main(String[] args) {
		//findFactorial(4);
		//findFactorial(25);
		//findFactorialRecursive(4);
		addToList(list);
		nthOddElement(list, 5);
		linearSearch(list, 112);
		//singleList.add(10);
		findMax(list);
		//findMax(singleList);
		System.out.println(list);
		
	}

}

