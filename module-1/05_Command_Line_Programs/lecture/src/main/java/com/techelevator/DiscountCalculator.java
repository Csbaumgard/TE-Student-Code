package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");


        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        double discountAmount;
        do {
            System.out.print("Enter the discount amount (w/out percentage): ");
            String userInput = scanner.nextLine();
            discountAmount = Double.parseDouble(userInput);
            System.out.println(discountAmount);
        } while(discountAmount < 0);

        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String userInput = scanner.nextLine();
        userInput = scanner.nextLine();
        String[] prices = userInput.split(" ");

        for (int i = 0; i < prices.length; i++) {
            String currentPrice = prices[i];
            double originalPrice = Double.parseDouble(currentPrice);
            double discountedPrice = originalPrice * (1 - discountAmount);




            System.out.println("Original price: $" + originalPrice + " Discounted price: $" + discountedPrice);
        }






    }

}