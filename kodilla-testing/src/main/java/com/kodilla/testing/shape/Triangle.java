package com.kodilla.testing.shape;

public class Triangle implements Shape {
    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public void getField() {
        System.out.println(50);
    }
}
