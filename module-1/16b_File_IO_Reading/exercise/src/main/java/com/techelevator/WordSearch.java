package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		printApplicationBanner();
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter path to input file -> ");
		String path = userInput.nextLine();

		File inputFile = new File(path);
		if (!inputFile.exists()) {
			System.out.println(path + " does not exist");
			System.exit(1);
		} else if (!inputFile.isFile()) {
			System.out.println(path + " is not a file.");
			System.exit(1);
		}

		System.out.println("Please enter word to search for -> ");
		String word = userInput.nextLine();
		System.out.println("Should the search be case sensitive? (Y/N)");
		String letter = userInput.nextLine();

		if (letter.equals("N")) {
			try (Scanner fileScanner = new Scanner(inputFile)) {
				int lineCount = 0;
				while (fileScanner.hasNextLine()) {
					lineCount++;
					String line = fileScanner.nextLine();
					if (line.toLowerCase().contains(word.toLowerCase())) {
						System.out.println(lineCount + ") " + line);
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println("The File Could Not Be Found");
			}
		} else if (letter.equals("Y")) {
			try (Scanner fileScanner = new Scanner(inputFile)) {
				int lineCount = 0;
				while (fileScanner.hasNextLine()) {
					lineCount++;
					String line = fileScanner.nextLine();
					if (line.contains(word)) {
						System.out.println(lineCount + ") " + line);
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println("The File Could Not Be Found");
				e.printStackTrace();
			}
		}
	}

	public static void printApplicationBanner() {
		System.out.println("*******************");
		System.out.println("****Word_Search****");
		System.out.println("*******************");
	}

}
