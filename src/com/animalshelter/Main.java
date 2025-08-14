package com.animalshelter;

public class Main {
    public static void main(String[] args) {
        // Create the shelter
        AnimalShelter shelter = new AnimalShelter();

        // Add some animals
        shelter.addAnimal(new Dog("Buddy"));
        shelter.addAnimal(new Cat("Mittens"));
        shelter.addAnimal(new Parrot("Charlie")); // Using the Parrot class

        // List animals
        System.out.println("Animals in shelter:");
        shelter.listAnimals();

        // Find an animal
        Animal found = shelter.findAnimal("Mittens");
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Animal not found.");
        }
    }
}
