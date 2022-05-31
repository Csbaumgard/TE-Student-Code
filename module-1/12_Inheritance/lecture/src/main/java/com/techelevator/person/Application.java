package com.techelevator.person;

public class Application {
    public static void main(String[] args) {

        Person bobTheBuilder = new Person("Bob", "Builder", 35);
        System.out.println(bobTheBuilder.printResume());

        Chef chefBoyardee = new Chef("Chef", "Boyardee", 45, "Ravioli");
        System.out.println(chefBoyardee.printResume());



    }
    public String printCursed() {
        boolean slabReturned = false;
        if (slabReturned) {
            System.out.println("You will not be cursed");
            return "You will not be cursed";

        }
        System.out.println("You will be cursed");
        return "You will be cursed";
    }
}
