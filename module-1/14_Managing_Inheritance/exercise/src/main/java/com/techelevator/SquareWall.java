package com.techelevator;

public class SquareWall extends RectangleWall {
    private int sideLength;

    public SquareWall(String name, String color, int sideLength) {
        super(name, color);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public int getArea() {
        return sideLength * 3;
    }

    public String toString() {
        return super.getName() + " (" + getSideLength() + "x" + getSideLength() + ") " + "square";
    }
}
