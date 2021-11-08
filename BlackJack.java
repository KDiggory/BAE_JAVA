package com.bae.exercises;

public class BlackJack {

	// given 2 integer values greater nthan 0- return which is closest to 21 without going over 21, if they are both 21 then return 0
	
	public static int play(int num1, int num2) {
		if ( (num1 > num2) && (num1 <= 21)) {
			return num1;
		} else if ( (num2 > num1) && (num2 <= 21)) {
			return num2;
		} else if (num1 == num2) {
			return 0;
		} else if ((num1 > 21) && (num2 < 21)) {
			return num2;
		} else if((num2 >21) && (num1 <21)) {
			return num1;
		}
		else {
		return 0;
		}
	}		
	
	public static void main(String[] args) {
	System.out.println(play(20, 16) );
	System.out.println(play(15, 16) );
	System.out.println(play(12, 12) );
	System.out.println(play(21, 21) );
	System.out.println(play(1,22));
	System.out.println(play(22,2));
	
	}

}
