package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling extends Throwable {
    public String probablyIWillThrowException(double x, double y) throws Exception {
        if(x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }
        return "Done!";
    }
}
