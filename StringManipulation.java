package com.bae.arrays;

public class StringManipulation {

	public static String today = "today it is sunny";
	public static String yesterday = "yesterday it was raining";
	
	public static void sunnyOrRaining() {
		today = today.toUpperCase();
		yesterday = yesterday.toUpperCase();
		String days = (today + ", " + yesterday);
		System.out.println(days);
		String subStr1 = (today.substring(0,12));
		String subStr2 = (yesterday.substring(17,24));
		String subStr = subStr1 + subStr2;
		System.out.println(subStr);
	}
	
	// When given a String, count and return how many words there are in that String.
	public static void methodOne(String input) {
		int wordCount = 0;
		char[] chars = input.toCharArray();
		for (int i: chars) {
			if (Character.isSpaceChar(i)) {
				wordCount ++;
			} 			
		} System.out.println("There are " + (wordCount + 1) + " words in this string");
		
	}	
	
	// length(), substring(), and equals() methods
	public static void methodOneHard(String input) {
		int wordCount = 0;
		for ( int i = 0; i < input.length(); i++) {
			if ((input.substring(i,(i+1)).equals(" "))) {
				wordCount ++;
			}
			
		} System.out.println("There are " + (wordCount + 1) + " words in this string");
		
	}
	
	// When given a String, print out this String in a vertical fashion, each word on a different line.
	
	public static void methodTwo(String input) {
		String[] stringz = input.split("\\s+");
		for (String s : stringz) {
			System.out.println(s);
			
			
		}
		
	}
	
	public static void methodTwoHard(String input) {
		int start = 0;
		int end = 0;
		int splitAt = 0;
		for (int i =0; i < input.length(); i++){
			if ((input.substring(i,(i+1)).equals(" "))) {
				splitAt = i;
				System.out.println(splitAt);
				//then  would need to somehow get the next instance of a space to determine the word length. Can't do this 
			}
			}
		
	}
	
	// When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
	public static void methodThree(String input) { // ive misread this and done something different! 
		char[] chars = input.toCharArray();
		for(char c: chars) {
			System.out.println(c);
		}
		
	}
	
	public static void methodThreeActual(String input) {
		int i, len = input.length();
	    StringBuilder rev = new StringBuilder(len);

	    for (i = (len - 1); i >= 0; i--){
	        rev.append(input.charAt(i));
	    }

	    String reversed =  rev.toString();
	    String[] stringz = reversed.split("\\s+");
		for (String s : stringz) {
			System.out.println(s);
	    }
	}
			
		
	
	public static void methodThreeHard(String input) {
		
		
	}
	
	public static void main(String[] args) {
	//	sunnyOrRaining();
	//	methodOne("How many words are in this string?");
	//	methodTwo("How many words are in this string?");
	//	methodThree("How many words are in this string?");
	//	methodOneHard("How many words are in this string?");
	//	methodTwoHard("How many words are in this string?");
		methodThreeActual("How many words are in this string?");
	}

}
