package com.techelevator;

public class Card {
    /*
    Fields, Properties, Member Variables, Instance Variables
    */
     private String suit;
     private String rank;
     private boolean isFaceUp;
     /*
     Constructors
      */
     public Card(String suit, String rank) {
         this.suit = suit;
         this.rank = rank;
         isFaceUp = true;

     }

     public Card(String suit, String rank, boolean isFaceUp) {
         this.suit = suit;
         this.rank = rank;
         this.isFaceUp = isFaceUp;
     }
     /*
     Getters and Setters
      */
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }

    //right click -> generate -> getter and setter

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    // Derived Property

    public String color() {
        if (suit.equals("Clubs") || suit.equals("Spades")) {
            return "Black";
        }
        return "Red";
    }

    // Methods

    public boolean flip() {
        isFaceUp = !isFaceUp;
        return isFaceUp;
    }
    public String displayCard() {
        if (isFaceUp) {
            return rank + " of " + suit;
        } else {
            return "##";
        }
    }
}
