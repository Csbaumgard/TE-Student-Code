package com.techelevator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {
		/*
		Where is the input file (please include the path to the file)? [path-to-file]/input.txt
How many lines of text (max) should there be in the split files? 3
The input file has 50 lines of text.

Each file that is created must have a sequential number assigned to it.

For a 50 line input file "input.txt", this produces 17 output files.

**GENERATING OUTPUT**

Generating input-1.txt
Generating input-2.txt
Generating input-3.txt
Generating input-4.txt
Generating input-5.txt
Generating input-6.txt
Generating input-7.txt
Generating input-8.txt
Generating input-9.txt
Generating input-10.txt
Generating input-11.txt
Generating input-12.txt
Generating input-13.txt
Generating input-14.txt
Generating input-15.txt
Generating input-16.txt
Generating input-17.txt
		 */
		printApplicationBanner();

		Scanner userInput = new Scanner(System.in);
		System.out.println("Where is the input file (please include the path to the file)?");
		String path = userInput.nextLine();
		File inputFile = new File(path);
		if (!inputFile.exists()) {
			System.out.println(path + " does not exist");
			System.exit(1);
		} else if (!inputFile.isFile()) {
			System.out.println(path + " is not a file.");
			System.exit(1);
		}

		System.out.println("How many lines of text (max) should there be in the split files?");
		String linesInput = userInput.nextLine();
		int lines = Integer.parseInt(linesInput);

		try {
			System.out.println("The input file has " + Files.lines(Path.of(path)).count() + " lines of text.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		public static void printApplicationBanner () {
		System.out.println("*********************");
		System.out.println("****File_Splitter****");
		System.out.println("*********************");
	}

}
