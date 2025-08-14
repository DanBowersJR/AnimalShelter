Animal Shelter
Description

This project implements an Animal Shelter system that only holds dogs and cats. The shelter operates on a first-in, first-out (FIFO) basis.

People adopting from the shelter can:

Take the oldest animal available (dequeueAny).

Choose a dog (dequeueDog) or a cat (dequeueCat) and get the oldest of that type.

The system does not allow selecting a specific animal.

Features

Enqueue animals (addAnimal)

Dequeue the oldest animal (dequeueAny)

Dequeue the oldest dog (dequeueDog)

Dequeue the oldest cat (dequeueCat)

List all animals in the shelter (listAnimals)

Classes

Animal – Abstract class for general animals

Dog – Represents a dog

Cat – Represents a cat

AnimalShelter – Contains the queue and methods to manage animals

Main – Demonstrates the functionality

How to Run

Clone the repository.

Open in IntelliJ or your preferred Java IDE.

Run the Main class.

Observe the console output showing animal operations.
