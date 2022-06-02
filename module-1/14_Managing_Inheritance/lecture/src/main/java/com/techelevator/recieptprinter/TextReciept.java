package com.techelevator.recieptprinter;

import java.util.ArrayList;
import java.util.List;

public class TextReciept extends Reciept {
    List<String> items = new ArrayList<>();
    @Override
    public String printHeading() {
        return "Reciept";
    }

    @Override
    public String printItems() {
        String itemString = "";

        for (String item : items) {
            itemString += item + "\n";
        }
        return null;
    }

    @Override
    public String printTotal() {
        return null;
    }
}
