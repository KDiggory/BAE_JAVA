package com.bae.arrays;

public class Arrays {
	
	
	public static int[] intArray = new int[10];
	// Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
	public static String [] nameArray = {"Katie", "George", "Huxley", "Oswin", "Sherman", "Valentine", "Olivia", "Tina", "Clive", "Harriet" };
	public static int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	public static boolean bool = false;
	
	public static void arrayLoop() {
		for (String name : nameArray) {
			System.out.println(name + " Diggory");
		}
		
	}
	
	// Create a for loop that populates an integer array with values, outputting them at each iteration
	
	public static void populateArray() {
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = (i);
			System.out.println(intArray[i]);
		} 
		System.out.println(intArray.toString()); // why does this print the object location not the array?		
		
	}
	
	// Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.
	public static void timesTen(int[] intArray) {
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = (i*10);
			System.out.println(intArray[i]);
			}
		}
	
	// Create an array of integers 1-20 and iterate through it, using an enhanced for loop, square, and then print each value.
	
	public static void enhancedSquaring() {
		int[] toSquare = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(int i : toSquare) {
			System.out.println(((int)Math.pow(toSquare[i], 2)));
		}
		
	}
	
	// Create a method that returns a boolean and accepts an integer as a parameter, if the integer is even, return true, if not then return false.
	
	public static void evenOrOdd(int toCheck) {
		if (toCheck%2==0) {
			bool = true;
		} else {
			bool = false;
		}
		
	}
	
	// Using the array of integers from exercise 2 and the method created in exercise 3; iterate through the array using an enhanced for loop, calling the method from exercise 3 in the body.
	public static void evenOrOddArray () {
		for(int i : nums) {
			evenOrOdd(i);
			if (bool == true) {
				System.out.println(("Even number - cubed " + i + ": " +(int)Math.pow(nums[i-1], 3)));
			} else {
				System.out.println(("Odd number - squared " + i + ": " +(int)Math.pow(nums[i-1], 2)));
			}
			} 
		} 
	
		
	
	public static void main(String[] args) {
		//arrayLoop();
		//populateArray();
	//	timesTen(intArray);
		//enhancedSquaring();
		//System.out.println(evenOrOdd(17));
		//System.out.println(evenOrOdd(14));
		evenOrOddArray();
	}
}
