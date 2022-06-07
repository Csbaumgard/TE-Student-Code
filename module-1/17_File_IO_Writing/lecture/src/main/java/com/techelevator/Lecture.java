package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */

		//Create File
		System.out.print("Enter a path or directory: ");
		String path = userInput.nextLine();

		File f = new File(path);

		/* ***************************
		 * INSPECTING THE FILESYSTEM
		 * ***************************/

		if(f.exists()) {
			System.out.println("The file or directory does exist");
		} else {
			System.out.println("The file or directory does not exist.");
		}

		/* ************************
		 * CREATING A DIRECTORY
		 * ************************/

		System.out.println();
		System.out.println("Let's create a new directory");
		System.out.println("Enter the path for the new directory -> ");
		path = userInput.nextLine();

		File newDirectory = new File(path);

		if (newDirectory.mkdir()) {
			System.out.println("The directory was created");
		} else {
			System.out.println("The directory was not created");
		}

		/* ************************
		 * CREATING A FILE
		 * ************************/

		System.out.println();
		System.out.println("Let's create a file!");
		System.out.println("Enter the path for a new file -> ");

		path = userInput.nextLine();

		File newFile = new File(path);

		try {
			if (newFile.createNewFile()) {
				System.out.println("The file was created successfully");
			} else {
				System.out.println("The was not created successfully");
			}
		} catch (IOException e) {
			System.out.println("The was not created successfully");
			e.printStackTrace();
		}

		/* ************************
		 * WRITING TO A FILE
		 * ************************/

		System.out.println();
		System.out.println("Let's write some stuff to a file.");
		System.out.println("Enter a message to put into the new file. -> ");

		String message = userInput.nextLine();

		try (PrintWriter writer = new PrintWriter(newFile)) {
			writer.println(message);
		} catch (FileNotFoundException e) {
			System.out.println("The file does not exist.");
			e.printStackTrace();
		}

		/* ************************
		 * FLUSHING THE BUFFER
		 * ************************/


		/* ************************
		 * APPENDING TO A FILE
		 * ************************/

		System.out.println();
		System.out.println("Let's append to a file.");
		System.out.println("Enter message to append -> ");

		message = userInput.nextLine();

		try (PrintWriter writer = new PrintWriter(new FileOutputStream(newFile, true))) {
			writer.println(message);
		} catch (IOException e) {
			System.out.println("The file was not found.");
		}

		/* ************************
		 * READING FROM A FILE, WHILE WRITING TO ANOTHER
		 * ************************/

		try (PrintWriter writer = new PrintWriter(new FileOutputStream("test2.txt", true))) {
			try (Scanner fileScanner = new Scanner(new File("test.txt"))) {
				while (fileScanner.hasNextLine()) {
					String line = fileScanner.nextLine();
					writer.println(line);
			}
			} catch (FileNotFoundException e) {
				System.out.println("Sorry, the file was not found.");
			}
		} catch (IOException e) {
			System.out.println("Sorry, an IO exception occurred.");
		}

	}

}
