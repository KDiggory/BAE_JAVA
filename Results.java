package com.bae.exercises;

import java.util.Scanner;

public class Results {

	static Scanner scan = new Scanner(System.in);
	static String phy;
	static String bio;
	static String chem;
	static String grade;
	static String Failgrade = null;

	public static void GetResults() {
		System.out.println("What mark did you get in Physics? ");
		double physics = scan.nextInt();
		System.out.println("Thanks, and what did you get for Chemistry? ");
		double chemistry = scan.nextInt();
		System.out.println("And lastly, what did you get for Biology? ");
		double biology = scan.nextInt();
		Percentage(physics, chemistry, biology);
	}

	public static double Percentage(double physics, double chemistry, double biology) {
		double total = physics + chemistry + biology;
		double percentage = ((total / 450) * 100);
		percentage = Round(percentage, 2);
		SingleResultPhysics(physics);
		SingleResultChem(chemistry);
		SingleResultBio(biology);
		Grade(percentage);
		return percentage;

	}

	public static double SingleResultBio(double grade) {
		double singleResult = ((grade / 150) * 100);
		singleResult = Round(singleResult, 2);
		TotalResultsBio(singleResult);
		return singleResult;

	}

	public static double SingleResultChem(double grade) {
		double singleResult = ((grade / 150) * 100);
		singleResult = Round(singleResult, 2);
		TotalResultsChem(singleResult);
		return singleResult;

	}

	public static double SingleResultPhysics(double grade) {
		double singleResult = ((grade / 150) * 100);
		singleResult = Round(singleResult, 2);
		TotalResultsPhy(singleResult);
		return singleResult;

	}

	public static double Round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}

	public static String Grade(double percentage) {
		if (percentage >= 80) {
			String grade = "A";
			FailOne();
			YourResults(grade);
			return grade;
		} else if (percentage >= 70) {
			String grade = "B";
			FailOne();
			YourResults(grade);
			return grade;
		} else if (percentage >= 60) {
			String grade = "C";
			FailOne();
			YourResults(grade);
			return grade;
		} else if (percentage >= 50) {
			String grade = "D";
			FailOne();
			YourResults(grade);
			return grade;
		} else if (percentage >= 40) {
			String grade = "E";
			FailOne();
			YourResults(grade);
			return grade;
		} else {
			String grade = "Fail";
			FailOne();
			YourResults(grade);
			return grade;
		}
	}

	public static String TotalResultsBio(double gradeBio) {
		if (gradeBio >= 80) {
			bio = "A";
		} else if (gradeBio >= 70) {
			bio = "B";
		} else if (gradeBio >= 60) {
			bio = "C";
		} else if (gradeBio >= 50) {
			bio = "D";
		} else {
			bio = "Fail";
		}
		System.out.println("Biology: " + gradeBio + " Grade: " + bio);
		return bio;
	}

	public static String TotalResultsChem(double gradeChem) {
		if (gradeChem >= 80) {
			chem = "A";
		} else if (gradeChem >= 70) {
			chem = "B";
		} else if (gradeChem >= 60) {
			chem = "C";
		} else if (gradeChem >= 50) {
			chem = "D";
		} else {
			chem = "Fail";
		}
		System.out.println("Chemistry: " + gradeChem + " Grade: " + chem);
		return chem;
	}

	public static String TotalResultsPhy(double gradePhy) {
		if (gradePhy >= 80) {
			phy = "A";
		} else if (gradePhy >= 70) {
			phy = "B";
		} else if (gradePhy >= 60) {
			phy = "C";
		} else if (gradePhy >= 50) {
			phy = "D";
		} else {
			phy = "Fail";
		}
		System.out.println("\rPhysics: " + gradePhy + " Grade: " + phy);
		return phy;
	}

	public static String FailOne() {
		if ((phy.equals("Fail")) & (bio.equals("Fail")) || (chem.equals("Fail"))) {
			Failgrade = "Failed 2";
		} else if ((phy.equals("Fail")) || (bio.equals("Fail")) & (chem.equals("Fail"))) {
			Failgrade = "Failed 2";
		}else if ((phy.equals("Fail"))|(bio.equals("Fail"))||(chem.equals("Fail"))) {
	Failgrade = "Fail";
	}else {
		Failgrade = null;
	}
		return Failgrade;
	}

	public static void YourResults(String grade) {
		if (Failgrade == null) {
			System.out.println("Overall you got: " + grade);
			if (grade.equals("A")) {
				System.out.println("\rFantastic job!");
			} else if (grade.equals("B")) {
				System.out.println("\rWell done");
			} else if (grade.equals("C")) {
				System.out.println("\rThats ok");
			} else if (grade.equals("D")) {
				System.out.println("\rNot bad I guess");
			} else if (grade.equals("E")) {
				System.out.println("\rAt least its a pass I guess");
			} else if (grade.equals("Fail")) {
				System.out.println("\rThats not really good enough, work harder!");
			}
		} else if (Failgrade.equals("Fail")) {
			System.out.println("That is an overall fail because you failed one exam");
		} else if (Failgrade.equals("Failed 2")) {
			System.out.println("That is an overall fail because you failed two exams");
		}
	}

	public static void main(String[] args) {
		GetResults();

	}
}
