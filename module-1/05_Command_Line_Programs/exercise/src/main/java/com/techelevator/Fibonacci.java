package com.techelevator;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Fibonacci Generator!");

		System.out.println("Please enter a number: ");
		String userInput = scanner.nextLine();
		int i = 0;
		int first = 0;
		int second = 1;
		int third = 1;
		int inputToInt = Integer.parseInt(userInput);

		while (i <= inputToInt && first <= inputToInt) {
			System.out.println(first + " ");
			third = second + first;
			first = second;
			second = third;
			i++;
		}
	}
}
