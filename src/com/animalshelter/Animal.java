package com.animalshelter;

public abstract class Animal {
    private String name;
    private int order; // used for FIFO

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
