package com.techelevator.fruittree;

import org.junit.Assert;
import org.junit.Test;

public class FruitTreeTest {

    @Test
    public void constructor_initializes_pieces_of_fruit_and_type_of_fruit() {

        //Arrange
       String type = "Apple";
       int pieces = 10;

        //Act
        FruitTree actualFruitTree = new FruitTree(type, pieces);

        //Assert
        Assert.assertEquals(type, actualFruitTree.getTypeOfFruit());
        Assert.assertEquals(pieces, actualFruitTree.getPiecesOfFruitLeft());
     }


    @Test
    public void pickFruit_returns_false_given_negative_input() {

        //Arrange
        FruitTree fruitTree = new FruitTree("Apple", 10);
        int piecesOfFruitLeftAfterPicking = fruitTree.getPiecesOfFruitLeft();

        //Act
        boolean didPickFruit = fruitTree.pickFruit(-1);

        //Assert
        Assert.assertEquals(false, didPickFruit);
        Assert.assertEquals(piecesOfFruitLeftAfterPicking, fruitTree.getPiecesOfFruitLeft());
    }
}
