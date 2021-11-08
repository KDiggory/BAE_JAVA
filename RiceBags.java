package com.bae.exercises;

public class RiceBags {
	
	public static int largeBag = 5;
	public static int smallBag = 1;
	public static boolean result = false;
	
	public static void packageGoals(int small, int large, int target ) {
		int largeAmount = large * largeBag;
	    if(largeAmount + small == target){
	    	System.out.println("Yes you can do this with what you've got!");
	    }else if((largeAmount >=target && largeAmount % target == 0)||(largeAmount >= target && target %5 <=small)){
	    	System.out.println("Yes you can do this with what you've got!");
	    }else if(small>=target){
	    	System.out.println("Yes you can do this with what you've got!");
	    }else if(largeAmount + small > target && target %largeAmount <= small){
	    	System.out.println("Yes you canthis with what you've got!");
	    }else{
	    	System.out.println("You can't do this with what you've got!");
	    }
		
	}

	public static void main(String[] args) {
		packageGoals(2,3, 12);
		packageGoals(12,3, 105400);
		 
		

	}

}
