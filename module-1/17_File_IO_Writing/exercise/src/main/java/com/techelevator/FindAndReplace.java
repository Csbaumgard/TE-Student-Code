package com.techelevator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        printApplicationBanner();

        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the search word?");
        String searchWord = userInput.nextLine();

        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();

        System.out.println("What is the source file?");
        String sourcePath = userInput.nextLine();
        File inputFile = new File(sourcePath);
        if (!inputFile.exists()) {
            System.out.println(sourcePath + " does not exist");
            System.exit(1);
        } else if (!inputFile.isFile()) {
            System.out.println(sourcePath + " is not a file.");
            System.exit(1);
        }

        System.out.println("What is the destination file?");
        String destinationPath = userInput.nextLine();
        File outputFile = new File(destinationPath);
        if (!outputFile.exists()) {
            System.out.println(destinationPath + " does not exist");
            System.exit(1);
        } else if (!outputFile.isFile()) {
            System.out.println(destinationPath + " is not a file.");
            System.exit(1);
        }

        try (PrintWriter writer = new PrintWriter(new FileOutputStream(destinationPath))) {
            Scanner fileScanner = new Scanner(inputFile);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                        if (line.contains(searchWord)) {
                            writer.println(line.replaceAll(searchWord, replacementWord));
                        } else {
                            writer.println(line);
                        }
                    }
                    System.out.println(outputFile);
                } catch (FileNotFoundException e) {
                    System.out.println("The file could not be found.");
                    e.printStackTrace();
                }
        }
        public static void printApplicationBanner () {
            System.out.println("********************");
            System.out.println("****Find&Replace****");
            System.out.println("********************");
        }
    }
