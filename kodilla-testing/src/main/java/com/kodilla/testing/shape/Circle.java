package com.kodilla.testing.shape;
public class Circle implements Shape {
    @Override
    public String getShapeName() {
        return "Circle";
        }

    @Override
    public void getField() {
        System.out.println(100);
    }
}
