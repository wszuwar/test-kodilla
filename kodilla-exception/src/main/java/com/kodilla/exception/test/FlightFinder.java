package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String,Boolean> flightRoute = new HashMap<>();
        flightRoute.put("Cracow",true);
        flightRoute.put("Stavanger",true);
        flightRoute.put("Oslo",true);
        flightRoute.put("Warsaw",true);

       if (flightRoute.containsKey(flight.getDepartureAirport()) && flight.getDepartureAirport()!=null){
           System.out.println("Your Flight is avaible");
       }else {
           throw new RouteNotFoundException("Your flight is unavaible or null");
       }
    }

}
