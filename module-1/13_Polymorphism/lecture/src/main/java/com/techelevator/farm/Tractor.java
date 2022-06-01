package com.techelevator.farm;

public class Tractor extends  Vehicle implements Sellable, Singable {
    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getSound() {
        return "vroom, vroom!";
    }
}
