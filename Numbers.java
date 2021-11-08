package com.bae.exercises;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Numbers {

	static List<Integer> singleNums = new ArrayList<Integer>();
	static List<Long> singleNumsWords = new ArrayList<Long>();

	public static void firstMethod(int num1) {
		while (num1 > 0) {
			singleNums.add(num1 % 10);
			num1 /= 10;
		}
		int sum = 0;
		for (int n : singleNums) {
			sum = sum + n;
		}
		System.out.println(sum);

	}

	public static long toWords(long num2) {
		while (num2 > 0) {
			singleNumsWords.add(num2 % 10);
			num2 /= 10;
		} 
		long sumW = 0;
		for (Long n : singleNumsWords) {
			sumW = sumW + n;
		}
		convert(sumW);
		return sumW;

	}

	private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };

	private static final String[] numNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	private static String convertLessThanOneThousand(int number) {
		String soFar;

		if (number % 100 < 20) {
			soFar = numNames[number % 100];
			number /= 100;
		} else {
			soFar = numNames[number % 10];
			number /= 10;

			soFar = tensNames[number % 10] + soFar;
			number /= 10;
		}
		if (number == 0)
			return soFar;
		return numNames[number] + " hundred" + soFar;
	}

	public static String convert(long number) {
		// 0 to 999 999 999 999
		if (number == 0) {
			return "zero";
		}

		String snumber = Long.toString(number);

		// pad with "0"
		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		snumber = df.format(number);

		// XXXnnnnnnnnn
		int billions = Integer.parseInt(snumber.substring(0, 3));
		// nnnXXXnnnnnn
		int millions = Integer.parseInt(snumber.substring(3, 6));
		// nnnnnnXXXnnn
		int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
		// nnnnnnnnnXXX
		int thousands = Integer.parseInt(snumber.substring(9, 12));

		String tradBillions;
		switch (billions) {
		case 0:
			tradBillions = "";
			break;
		case 1:
			tradBillions = convertLessThanOneThousand(billions) + " billion ";
			break;
		default:
			tradBillions = convertLessThanOneThousand(billions) + " billion ";
		}
		String result = tradBillions;

		String tradMillions;
		switch (millions) {
		case 0:
			tradMillions = "";
			break;
		case 1:
			tradMillions = convertLessThanOneThousand(millions) + " million ";
			break;
		default:
			tradMillions = convertLessThanOneThousand(millions) + " million ";
		}
		result = result + tradMillions;

		String tradHundredThousands;
		switch (hundredThousands) {
		case 0:
			tradHundredThousands = "";
			break;
		case 1:
			tradHundredThousands = "one thousand ";
			break;
		default:
			tradHundredThousands = convertLessThanOneThousand(hundredThousands) + " thousand ";
		}
		result = result + tradHundredThousands;

		String tradThousand;
		tradThousand = convertLessThanOneThousand(thousands);
		result = result + tradThousand;

		// remove extra spaces
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}
	
	public static void inForLoop() {
		for (int i = 0; i<=100; i++) {
			System.out.println(convert(i));
		}
	}

	public static void main(String[] args) {
		//firstMethod(123);
		// System.out.println(convert(toWords(5999568)));
		inForLoop();

	}
}
