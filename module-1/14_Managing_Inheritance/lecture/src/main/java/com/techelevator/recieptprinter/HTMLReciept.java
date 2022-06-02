package com.techelevator.recieptprinter;

import java.util.ArrayList;
import java.util.List;

public class HTMLReciept extends Reciept {
    private List<String> items = new ArrayList<>();

    @Override
    public String printHeading() {
        return "<h1>Reciept</h1>";
    }

    @Override
    public String printItems() {
        String itemString = "";
        for (String item : items) {
            itemString += "<li>" + item + "</li>";
        }
        itemString += "<ul>";
        return itemString;
    }

    @Override
    public String printTotal() {
        return null;
    }
}
