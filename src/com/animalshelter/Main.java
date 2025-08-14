package com.animalshelter;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        // Add animals
        shelter.addAnimal(new Dog("Buddy"));
        shelter.addAnimal(new Dog("Rex"));
        shelter.addAnimal(new Cat("Mittens"));
        shelter.addAnimal(new Cat("Whiskers"));

        // List animals
        System.out.println("All animals in shelter:");
        shelter.listAnimals();

        // Test dequeue operations
        System.out.println("\nDequeue any: " + shelter.dequeueAny());
        System.out.println("Dequeue dog: " + shelter.dequeueDog());
        System.out.println("Dequeue cat: " + shelter.dequeueCat());

        // Show remaining animals
        System.out.println("\nRemaining animals:");
        shelter.listAnimals();
    }
}
