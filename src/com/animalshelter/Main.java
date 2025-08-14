package com.animalshelter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Animal Shelter program starting...");

        AnimalShelter shelter = new AnimalShelter();

        // Add a few animals
        shelter.addAnimal(new Dog("Buddy"));
        shelter.addAnimal(new Cat("Whiskers"));

        // List them
        shelter.listAnimals();
    }
}
