package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }return result;
    }
   public void getFigure(int n){
        shapes.get(n);
    }
    public void showFigures(){
        for (int i=0; i<shapes.size(); i++){

            shapes.get(i).getShapeName();

        }
    }



}

