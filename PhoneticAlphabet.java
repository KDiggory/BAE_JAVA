package com.bae.dayOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PhoneticAlphabet {


	static List<String> letters = new ArrayList<String>();
	static Random rand = new Random();
	static int correct = 0;
	static int wrong = 0;
	static int games;
	static int played;
	static Scanner scan = new Scanner(System.in);
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUPVXYZ";

	static void Play() {
		System.out.println("Are you ready to play? ");
		System.out.println("How many times would you like to play?");
		int toPlay = scan.nextInt();
		System.out.println("Great, we are going to play " + toPlay + " times!");
		played = 0;
		while (toPlay > played) {
			int index = rand.nextInt(alphabet.length());
			char check = alphabet.charAt(index);
			System.out.println("The letter is " + check);
			System.out.println("What is your answer? ");
			String answer = scan.nextLine();
			// this is not picking up the inpuut for the first time! Why?
			Check(check, answer);
			played++;
		}
		System.out.println("You have played " + toPlay + " games. You got " + correct +" correct, and " + wrong + " wrong.");

	}

	static void Check(char check, String answer) {

		if (check == 'A') {
			if (answer.toLowerCase().contains("alpha")){
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'B') {
			if (answer.toLowerCase().contains("bravo") ) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'C') {
			if (answer.toLowerCase().contains("charlie") ) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'D') {
			if (answer.toLowerCase().contains("delta")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'E') {
			if (answer.toLowerCase().contains("echo")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'F') {
			if (answer.toLowerCase().contains("foxtrot")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'G') {
			if (answer.toLowerCase().contains("golf")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'H') {
			if (answer.toLowerCase().contains("hotel")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'I') {
			if (answer.toLowerCase().contains("india")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'J') {
			if (answer.toLowerCase().contains("juliet")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'K') {
			if (answer.toLowerCase().contains("kilo")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'L') {
			if (answer.toLowerCase().contains("lima")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'M') {
			if (answer.toLowerCase().contains("mike")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'N') {
			if (answer.toLowerCase().contains("november")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'O') {
			if (answer.toLowerCase().contains("oscar")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'P') {
			if (answer.toLowerCase().contains("papa")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'Q') {
			if (answer.toLowerCase().contains("quebec")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'R') {
			if (answer.toLowerCase().contains("romeo")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'S') {
			if (answer.toLowerCase().contains("sierra")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'T') {
			if (answer.toLowerCase().contains("tango")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'U') {
			if (answer.toLowerCase().contains("uniform")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'V') {
			if (answer.toLowerCase().contains("victor")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'W') {
			if (answer.toLowerCase().contains("whiskey")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'X') {
			if (answer.toLowerCase().contains("x-ray")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'Y') {
			if (answer.toLowerCase().contains("yankee")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else if (check == 'Z') {
			if (answer.toLowerCase().contains("zulu")) {
				System.out.println("Correct");
				correct++;
			} else {
				System.out.println("Wrong answer");
				wrong++;
			}
		} else {
			System.out.println("I didn't understand that, maybe you spelt it wrong or maybe you are just wrong!");
		}

	}

	public static void main(String[] args) {
		Play();

	}

}
