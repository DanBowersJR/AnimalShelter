package com.animalshelter;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
