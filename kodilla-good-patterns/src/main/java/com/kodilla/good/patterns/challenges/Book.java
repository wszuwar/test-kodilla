package com.kodilla.good.patterns.challenges;

public class Book extends Product {

    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
