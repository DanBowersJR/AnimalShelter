package com.animalshelter;

public abstract class Animal {
    private String name;
    private int order; // arrival order

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + ": " + name;
    }
}
