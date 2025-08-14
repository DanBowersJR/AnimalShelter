package com.animalshelter;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    private List<Animal> animals;

    public AnimalShelter() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the shelter.");
        } else {
            System.out.println("Animals in the shelter:");
            for (Animal animal : animals) {
                System.out.println("- " + animal.getName());
            }
        }
    }
}
