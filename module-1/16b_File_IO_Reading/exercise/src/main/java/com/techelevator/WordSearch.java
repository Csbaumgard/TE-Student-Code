package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		printApplicationBanner();

		File inputFile = getInputFileFromUser();

		Scanner wordScanner = new Scanner(System.in);
		System.out.println("Please enter word to search for -> ");
		String word = wordScanner.nextLine();

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
		}
	}

	private static File getInputFileFromUser() {
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
		return inputFile;
	}

	public static void printApplicationBanner() {
		System.out.println("*******************");
		System.out.println("****Word Search****");
		System.out.println("*******************");
	}

}
