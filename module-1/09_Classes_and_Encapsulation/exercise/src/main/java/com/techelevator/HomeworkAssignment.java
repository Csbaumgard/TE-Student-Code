package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }
    public String getLetterGrade() {
        double gradePercentage = (double) earnedMarks / possibleMarks;
        if (gradePercentage >= 0.90) {
            return "A";
        } else if (gradePercentage >= 0.80) {
            return "B";
        } else if (gradePercentage >= 0.70) {
            return "C";
        } else if (gradePercentage >= 0.60) {
            return "D";
        } else {
            return "F";
        }
    }
}

