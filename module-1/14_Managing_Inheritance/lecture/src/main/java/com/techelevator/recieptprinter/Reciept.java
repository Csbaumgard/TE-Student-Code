package com.techelevator.recieptprinter;

public abstract class Reciept {

    public String print() {
        String reciept = "";

        reciept += printHeading();

        reciept += printItems();

        reciept += printTotal();

        return reciept;
    }

    public abstract String printHeading();
    public abstract String printItems();
    public abstract String printTotal();

}
