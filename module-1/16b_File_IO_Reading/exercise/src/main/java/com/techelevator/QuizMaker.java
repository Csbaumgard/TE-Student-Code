package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

	public static void main(String[] args) {
		Scanner fileScanner = new Scanner("test_quiz.txt");
		int lineBreak = fileScanner.nextLine().indexOf("|");
		String question = fileScanner.nextLine().substring(0, lineBreak);
		String[] answerArray = fileScanner.nextLine().substring(lineBreak).split("|");

		System.out.println(question);
		int counter = 0;
		for (String s : answerArray) {
			counter++;
			System.out.println(counter + ". " + s);
		}
		Scanner userInput = new Scanner(System.in);



		

	}

}
