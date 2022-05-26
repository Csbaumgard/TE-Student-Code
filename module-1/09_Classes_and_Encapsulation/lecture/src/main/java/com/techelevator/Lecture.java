package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        Card aceOfSpades = new Card("Spades", "Ace", false);
        Card twoOfClubs = new Card("Clubs", "Two", true);

        aceOfSpades.color();
        aceOfSpades.getSuit();
        aceOfSpades.setSuit("Hearts");
        aceOfSpades.flip();

        Card aceOfDiamonds = new Card("Diamonds", "Ace", false);
        Card aceOfHearts = new Card("Hearts", "Ace", false);
        Card kingOfHearts = new Card("Hearts", "King", false);

        List<Card> pokerCards = new ArrayList<>();
        pokerCards.add(aceOfDiamonds);
        pokerCards.add(aceOfHearts);
        pokerCards.add(aceOfSpades);

        Deck pokerDeck = new Deck(pokerCards);

        pokerDeck.addCard(kingOfHearts);
    }
}
