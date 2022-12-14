package com.techelevator;

import com.techelevator.person.Person;

public class Application {

    public static void main(String[] args) {


        // Create a new general auction
        System.out.println("--------------------------");
        System.out.println("Starting a general auction");
        System.out.println("--------------------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        Bid firstBid = new Bid("Josh", 1);
        System.out.println("First Bid: " + firstBid.toString());

        Bid secondBid = new Bid("Josh", 1);
        System.out.println("Are bids equal? " + firstBid.equals(secondBid));

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        String whoWon = generalAuction.getHighBid().getBidder();
        String whatDidTheyWin = generalAuction.getItemForSale();
        int howMuchDidTheyPay = generalAuction.getHighBid().getBidAmount();

        System.out.println(generalAuction.getHighBid().getBidder());

        // Create a new reserve auction
        System.out.println("--------------------------");
        System.out.println("Starting a reserve auction");
        System.out.println("--------------------------");

        ReserveAuction reserveAuction = new ReserveAuction("Tech Elevator Backpack", 25);

        reserveAuction.placeBid(new Bid("Josh", 10));
        reserveAuction.placeBid(new Bid("Fonz", 28));
        reserveAuction.placeBid(new Bid("Rick Astley", 25));

        System.out.println(reserveAuction.getHighBid().getBidder());

        System.out.println("--------------------------");
        System.out.println("Starting a buy it now auction");
        System.out.println("--------------------------");

        BuyItNowAuction buyItNowAuction = new BuyItNowAuction("Tech Elevator Backpack", 25);

        buyItNowAuction.placeBid(new Bid("Josh", 10));
        buyItNowAuction.placeBid(new Bid("Fonz", 28));
        buyItNowAuction.placeBid(new Bid("Rick Astley", 25));

        System.out.println(buyItNowAuction.getHighBid().getBidder());

    }
}
