package com.bae.iteration;

import java.util.ArrayList;

import java.util.List;

public class Coins {

	public static List<String> change = new ArrayList<String>();

	public static List<String> changeGiven(float given, float cost) {
		float amount = given - cost;

		if ((given - cost) >= 0) {
			while (((given - cost) >= 0) && ((given - cost) > 50)) {
				change.add("£50 note");
				given = given - 50;
			}
			while (((given - cost) >= 0) && ((given - cost) > 20)) {
				change.add("£20 note");
				given = given - 20;
			}
			while (((given - cost) >= 0) && ((given - cost) > 10)) {
				change.add("£10 note");
				given = given - 10;
			}
			while (((given - cost) >= 0) && ((given - cost) > 5)) {
				change.add("£5 note");
				given = given - 5;
			}
			while (((given - cost) >= 0) && ((given - cost) > 2)) {
				change.add("£2 coin");
				given = given - 2;
			}
			while (((given - cost) >= 0) && ((given - cost) > 1)) {
				change.add("£1 coin");
				given = given - 1;
			}
			while (((given - cost) >= 0) && ((given - cost) > 0.5f)) {
				change.add("50p coin");
				given = given - 0.5f;
			}
			while (((given - cost) >= 0) && ((given - cost) > 0.2f)) {
				change.add("20p coin");
				given = given - 0.2f;
			}
			while (((given - cost) >= 0) && ((given - cost) > 0.1f)) {
				change.add("10p coin");
				given = given - 0.1f;
			}
			while (((given - cost) >= 0) && ((given - cost) > 0.05f)) {
				change.add("5p coin");
				given = given - 0.05f;
			}
			while (((given - cost) >= 0) && ((given - cost) > 0.02f)) {
				change.add("2p coin");
				given = given - 0.02f;
			}
			while (((given - cost) >= 0) && ((given - cost) > 0.01f)) {
				change.add("1p coin");
				given = given - 0.01f;
			}
			if (given == 0.01) {
				change.add("1p coin"); // sometimes this gives the wrong number of 1p coins!! - one too few
			}
			System.out.println("Your change is: " + String.format("%.2f", amount) + "\n" + change);
		} else if (given == cost) {
			System.out.println("No change needed");
		} else {
			System.out.println("You've not got enough money");
		}
		return change;

	}

	public static void toNiceWording(List<String> change) {
		int fifties = 0;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int twoPou = 0;
		int onePou = 0;
		int fiftyP = 0;
		int twentyP = 0;
		int tenP = 0;
		int fiveP = 0;
		int twoP = 0;
		int oneP = 0;
		for (int i = 0; i < change.size(); i++) {
			if (change.get(i).equals("£50 note")) {
				fifties++;
			} else if (change.get(i).equals("£20 note")) {
				twenties++;
			} else if (change.get(i).equals("£10 note")) {
				tens++;
			} else if (change.get(i).equals("£5 note")) {
				fives++;
			} else if (change.get(i).equals("£2 coin")) {
				twoPou++;
			} else if (change.get(i).equals("£1 coin")) {
				onePou++;
			} else if (change.get(i).equals("50p coin")) {
				fiftyP++;
			} else if (change.get(i).equals("20p coin")) {
				twentyP++;
			} else if (change.get(i).equals("10p coin")) {
				tenP++;
			} else if (change.get(i).equals("5p coin")) {
				fiveP++;
			} else if (change.get(i).equals("2p coin")) {
				twoP++;
			} else if (change.get(i).equals("1p coin")) {
				oneP++;
			}

		}
		System.out.println("Your change consists of: ");
		if (fifties > 0) {
			System.out.println(fifties + ": £50 notes.");
		}
		if (twenties > 0) {
			System.out.println(twenties + ": £20 notes.");
		}
		if (tens > 0) {
			System.out.println(tens + ": £10 notes.");
		}
		if (fives > 0) {
			System.out.println(fives + ": £5 notes.");
		}
		if (twoPou > 0) {
			System.out.println(twoPou + ": £2 coins.");
		}
		if (onePou > 0) {
			System.out.println(onePou + ": £1 coins.");
		}
		if (fiftyP > 0) {
			System.out.println(fiftyP + ": 50p coins.");
		}
		if (twentyP > 0) {
			System.out.println(twentyP + ": 20p coins.");
		}
		if (tenP > 0) {
			System.out.println(tenP + ": 10p coins.");
		}
		if (fiveP > 0) {
			System.out.println(fiveP + ": 5p coins.");
		}
		if (twoP > 0) {
			System.out.println(twoP + ": 2p coins.");
		}
		if (oneP > 0) {
			System.out.println(oneP + ": 1p coins.");
		}
	}

	public static void main(String[] args) {
		//changeGiven((float) 100, (float) 65.37);
		changeGiven((float) 2, (float) 2);
		
		// toNiceWording(changeGiven((float) 5, (float) 3.76));

	}

}
