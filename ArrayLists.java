package com.bae.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
	
	public static void method() {
		//make new arraylist
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		//add things to it
		arrayList.add(34);
		arrayList.add(11);
		arrayList.add(954);
		arrayList.add(-56);
		arrayList.add(875);
		arrayList.add(105);
		arrayList.add(-4);
		arrayList.add(0);
		arrayList.add(453);
		arrayList.add(645);
		
		// print it out
		System.out.println(arrayList);
		
		// iterate through the list and print each element - normal and enhanced for loops
		for ( int num =0; num < arrayList.size(); num ++) {
			System.out.println(num);
		}
		for ( int num : arrayList) {
			System.out.println(num);
		}
		
		// get specific elements
		arrayList.get(1);
		
		//set specific elements
		arrayList.set(0, -1);
		
		// remove specific elements
		arrayList.remove(0);
		
		// sort list
		arrayList.sort(null);
		System.out.println(arrayList);
		
		//reverse()
		Collections.reverse(arrayList);
		
		//swap()
		Collections.swap(arrayList, 0, 4);
		
		//clone()
		
 		
	}
	
public static void main(String[] args) {
	method();
	
}

}
