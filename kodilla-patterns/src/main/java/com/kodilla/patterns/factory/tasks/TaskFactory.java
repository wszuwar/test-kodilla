package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case DRIVING:
                return new Driving("Drive fast","date","momy's car");
            case PAINTING:
                return new PaintingTask("Paint nicely","green","rusty car");
            case SHOPPING:
                return new ShoppingTask("Shopping","tomato",5.0);
                default:
                    return null;
        }
    }

}
