package com.animalshelter;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimals() {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }

    public Animal findAnimal(String name) {
        for (Animal a : animals) {
            if (a.getName().equalsIgnoreCase(name)) {
                return a;
            }
        }
        return null;
    }
}
