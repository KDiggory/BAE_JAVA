package com.bae.dayOne;

import java.util.concurrent.TimeUnit;


public class SlowTyping {
	
	public static void slowPrint(String output) {
		for (int i=0; i<output.length(); i ++) {
			char c = output.charAt(i);
			System.out.print(c);
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (Exception e) {
				
			}
		}
	
	}
	public static void main(String[] args) {
		slowPrint("Printing slowly!!");

	}

}
