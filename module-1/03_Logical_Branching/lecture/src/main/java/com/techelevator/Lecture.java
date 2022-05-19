package com.techelevator;

public class Lecture {
    /*
    1. This method is named returnNotOne and it returns an int. Change
    it so that it returns something other than a 1.
    */
    public int returnNotOne() {
<<<<<<< HEAD
        return 2;
=======
        return 1;
>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
    }

    /*
    2. This method is named returnNotHalf and it returns a double. Change
    it so that it returns something other than a 0.5.
    */
    public double returnNotHalf() {
<<<<<<< HEAD
        return 1.5;
=======
        return 0.5;
>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
    }

    /*
    3. This method needs to return a String. Fix it to return a valid String.
    */
    public String returnName() {
<<<<<<< HEAD
        return "name";
=======
        return null;
>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
    }

    /*
    4. This method currently returns an int. Change it so that it returns a double.
    */
<<<<<<< HEAD
    public double returnDoubleOfTwo() {
=======
    public int returnDoubleOfTwo() {
>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
        return 2;
    }

    /*
    5. This method should return the language that you're learning. Change
    it so that it does that.
    */
<<<<<<< HEAD
    public String returnNameOfLanguage() {
        return "Java";
=======
    public boolean returnNameOfLanguage() {
        return false;
>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
    }

    /*
    6. This method uses an if statement to define what to return. Have it
<<<<<<< HEAD
    return true if the if statement passes
    */
    public boolean returnTrueFromIf() {
        if (false) {
            return false;
        }

        return true;
=======
    return true if the if statement passes.
    */
    public boolean returnTrueFromIf() {
        if (true) {
            return false;
        }

        return false;
>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
    }

    /*
    7. This method uses an if to check to make sure that one is equal
    to one. Make sure it returns true when one equals one.
    */
    public boolean returnTrueWhenOneEqualsOne() {
        if (1 == 1) {
<<<<<<< HEAD
            return true;
=======
            return false;
>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
        }

        return false;
    }

    /*
    8. This method checks a parameter passed to the method to see if it's
    greater than 5 and returns true if it is.
    */
    public boolean returnTrueWhenGreaterThanFive(int number) {
        if (number > 5) {
<<<<<<< HEAD
            return true;
=======

        } else {

>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
        }
        return false;
    }

    /*
    9. If you think about it, we really don't need the if statement above.
    How can we rewrite exercise 8 to have only one line of code?
    */
    public boolean returnTrueWhenGreaterThanFiveInOneLine(int number) {
<<<<<<< HEAD
        return number > 5; // What can we put here that returns a boolean that we want?
=======
        return false; // What can we put here that returns a boolean that we want?
>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
    }

    /*
    10. This method will take a number and do the following things to it:
    * If addThree is true, we'll add three to that number
    * If addFive is true, we'll add five to that number
    * We'll then return the result
    */
    public int returnNumberAfterAddThreeAndAddFive(int number, boolean addThree, boolean addFive) {
        if (addThree) {
<<<<<<< HEAD
            number = number + 3;
=======
            number = number + 1;
>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
        }

        // We can't use an else here. They could both be true, so we have to check each one.

        if (addFive) {
<<<<<<< HEAD
            number += 5;
=======
            number += 1;
>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
        }

        return number;
    }

    /*
    11. Write an if statement that returns "Fizz" if the parameter is 3 and returns an empty String for anything else.
    */
    public String returnFizzIfThree(int number) {
<<<<<<< HEAD
        if (number == 3) {
            return "Fizz";
        }
        return "";

=======
        return "";
>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
    }

    /*
    12. Now write the above using the Ternary operator ?:. If you're not sure what this is, you can Google it.
    */
    public String returnFizzIfThreeUsingTernary(int number) {
<<<<<<< HEAD
        return number == 3 ? "Fizz" : "";
    }


=======
        return "";
    }

>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
    /*
    13. Write an if/else statement that returns "Fizz" if the parameter is 3, "Buzz" if the parameter is 5 and an empty String for anything else.
    */
    public String returnFizzOrBuzzOrNothing(int number) {
<<<<<<< HEAD
        if (number == 3) {
            return "Fizz";
        } else if (number == 5) {
            return "Buzz";
        }
=======
>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
        return "";
    }

    /*
    14. Write an if statement that checks if the parameter number is either equal to or greater than 18. Return "Adult" if it is or "Minor" if it's not.
    */
    public String returnAdultOrMinor(int number) {
<<<<<<< HEAD
        if (number >= 18) {
            return "Adult";
        }
        return "Minor";
    }


    /*
    15. Now, do it again with a different boolean operation.
    */
    public String returnAdultOrMinorAgain(int number) {
        if (number < 18) {
            return "Minor";
        }
        return "Adult";
    }


=======
        if (true) {
            return "Adult";
        } else {
            return "Minor";
        }
    }

    /*
    15. Now, do it again with a different boolean opeation.
    */
    public String returnAdultOrMinorAgain(int number) {
        if (true) {
            return "Adult";
        } else {
            return "Minor";
        }
    }

>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
    /*
    16. Return as above, but also return "Teen" if the number is between 13 and 17 inclusive.
    */
    public String returnAdultOrMinorOrTeen(int number) {
<<<<<<< HEAD
        if (number >= 18) {
            return "Adult";
        } else if (number > 12) {
            return "Teen";
        }
        return "Minor";
    }
public boolean isHybrid(boolean isGas, boolean isDiesel, boolean isElectric) {
        if (isGas && isDiesel) {
            return true;
        } else if (isGas && isElectric) {
            return true;
        } else if (isDiesel && isElectric) {
            return true;
        }
        return false;
}


}


=======
        if (true) {
            return "Adult";
        } else if (true) {
            return "Teen";
        } else {
            return "Minor";
        }
    }

}
>>>>>>> 38caf5a5a05216fc20ae83b46a97cc512365eeb9
