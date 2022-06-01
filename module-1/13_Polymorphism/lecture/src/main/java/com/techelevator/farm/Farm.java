package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<FarmAnimal> animals = new ArrayList<>();

    public void addAnimal(FarmAnimal animal) {
        animals.add(animal);
    }


    /* Shortened to addAnimal
    public void addPig(Pig pig) {
        animals.add(pig);
    }
    public void addChicken(Chicken chicken) {
        animals.add(chicken);
    }
    public void addCow(Cow cow) {
        animals.add(cow);
    }
    */
}
