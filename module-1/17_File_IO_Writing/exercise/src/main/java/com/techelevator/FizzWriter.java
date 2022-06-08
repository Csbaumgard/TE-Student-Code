package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		printApplicationBanner();

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the destination file.");
		String path = userInput.nextLine();
		File outputFile = new File(path);


		try (PrintWriter writer = new PrintWriter(new FileOutputStream(path))) {
			int counter = 1;
			while (counter <= 300) {
				if (counter % 5 == 0 && counter % 3 == 0) {
					writer.println("FizzBuzz");
					counter++;
				}
				if (counter % 5 == 0) {
					writer.println("Buzz");
					counter++;
				}
				if (counter % 3 == 0) {
					writer.println("Fizz");
					counter++;
				} else if (counter <= 300) {
					writer.println(counter);
					counter++;
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
		public static void printApplicationBanner () {
		System.out.println("*******************");
		System.out.println("****Fizz_Writer****");
		System.out.println("*******************");
	}


}
