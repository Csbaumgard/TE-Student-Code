package com.techelevator;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Welcome to the Decimal to Binary Converter!");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter in a series of decimal values (separated by spaces): ");

		String userInput = scanner.nextLine();
		String[] decimals = userInput.split(" ");

		for (int i = 0; i < decimals.length; i++) {
			String currentDecimal = decimals[i];
			int decimalOutput = Integer.parseInt(currentDecimal);
			String binaryOutput = Integer.toBinaryString(decimalOutput);
			System.out.println(decimalOutput + " in binary is " + binaryOutput);
		}
	}
}
