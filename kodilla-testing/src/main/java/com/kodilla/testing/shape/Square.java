package com.kodilla.testing.shape;

public class Square implements Shape {
    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public void getField() {
        System.out.println(75);
    }
}
