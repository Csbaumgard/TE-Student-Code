package com.techelevator.person;

public class Chef extends Person {
    private String cuisine;

    public Chef(String firstName, String lastName, int age, String cuisine) {
        super(firstName, lastName, age);
        this.cuisine = cuisine;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String printResume() {

        return super.printResume() + ", " + getCuisine();
    }
    public String myMoney(boolean isJiggleJiggle) {
        if (!isJiggleJiggle) {
            return "It Folds";
        }
        return "My money does jiggle, jiggle";
    }
    public String returnMyMoney() {
        System.out.println(myMoney(false));
        return "the slab";
    }
}
