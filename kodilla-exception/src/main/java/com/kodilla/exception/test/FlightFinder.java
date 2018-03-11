package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String,Boolean> flightRoute = new HashMap<>();
        flightRoute.put("Cracow",true);
        flightRoute.put("Stavanger",true);
        flightRoute.put("Oslo",true);
        flightRoute.put("Warsaw",true);

       if ( flightRoute.containsKey(flight.getDepartureAirport())&& flightRoute.get(flight.getDepartureAirport()) ){
             System.out.println("Your Flight is avaible");
       }else  {
           throw new RouteNotFoundException("Your flight is unavaible");
       }
    }

}
