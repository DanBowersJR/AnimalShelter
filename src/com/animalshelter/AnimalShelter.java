package com.animalshelter;

import java.util.LinkedList;

public class AnimalShelter {
    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0; // to track arrival order

    public void addAnimal(Animal animal) {
        animal.setOrder(order++);
        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        } else {
            System.out.println("Shelter only accepts dogs and cats!");
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) return null;
        if (dogs.isEmpty()) return dequeueCat();
        if (cats.isEmpty()) return dequeueDog();

        Dog oldestDog = dogs.peek();
        Cat oldestCat = cats.peek();

        if (oldestDog.getOrder() < oldestCat.getOrder()) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    public Dog dequeueDog() {
        return dogs.isEmpty() ? null : dogs.poll();
    }

    public Cat dequeueCat() {
        return cats.isEmpty() ? null : cats.poll();
    }

    public void listAnimals() {
        System.out.println("Dogs in shelter:");
        for (Dog dog : dogs) System.out.println(dog);
        System.out.println("Cats in shelter:");
        for (Cat cat : cats) System.out.println(cat);
    }
}
