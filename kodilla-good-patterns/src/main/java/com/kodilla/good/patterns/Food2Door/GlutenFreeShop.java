package com.kodilla.good.patterns.Food2Door;

public class GlutenFreeShop extends Shop {
public String name = "rema 1000";

    @Override
    public String getName() {
        return name;
    }

    public GlutenFreeShop(String name) {
        super(name);
    }
}
