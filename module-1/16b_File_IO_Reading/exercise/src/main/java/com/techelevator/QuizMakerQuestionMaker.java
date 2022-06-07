package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMakerQuestionMaker extends QuizMaker{
    Scanner fileScanner = new Scanner("test_quiz.txt");
    int lineBreak = fileScanner.nextLine().indexOf("|");
    String question = fileScanner.nextLine().substring(0, lineBreak);
    String[] answerArray = fileScanner.nextLine().substring(lineBreak).split("|");

}
