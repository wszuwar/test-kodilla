package com.kodilla.exception.test;

public class FlightMainApp {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Stavanger","Cracow");
        Flight flight2 = new Flight("Cracow","Bangkok");
        Flight flight3 = new Flight("Warsaw","Bergen");

        FlightFinder find = new FlightFinder();
        try {
            find.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("flight was not found");
        }
    }
}
