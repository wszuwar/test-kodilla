package com.kodilla.good.patterns.Flights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ConnectionsChecker implements CheckConnections {
    FlightMapCreator flightMapCreator = new FlightMapCreator();
    public HashMap<String, ArrayList<String>> createdFlyMap = flightMapCreator.mapCreator();

    @Override
    public boolean checkDeparture(FlightRequest flightRequest) {
        String departure = flightRequest.getDeparture();
        boolean flightAvaible = false;
        String arrivals = "";
        for (Map.Entry<String, ArrayList<String>> flymap : createdFlyMap.entrySet()) {
            if (flymap.getKey().equals(departure)) {
                arrivals = createdFlyMap.entrySet().stream()
                        .filter(s -> s.getKey().equals(departure))
                        .flatMap(s -> s.getValue().stream())
                        .collect(Collectors.joining(", ", " All airports available from " + departure + ": ", "."));
                flightAvaible = true;
            }
        }
        if (flightAvaible) {
            System.out.println(arrivals);
            return true;
        } else {
            System.out.println("Theres no flight avaible from this departure");
            return false;
        }

    }

    @Override
    public boolean checkArival(FlightRequest flightRequest) {
        boolean flightAvaible = false;
        String departure = flightRequest.getDeparture();
        String arrival = flightRequest.getArrival();
        String departures = "";
        for (Map.Entry<String, ArrayList<String>> flyMap : createdFlyMap.entrySet()) {
            ArrayList<String> values = flyMap.getValue();
            for (String cities : values) {
                if (cities.equals(arrival)) {
                    if (flyMap.getKey().equals(departure)) {
                        departures += "" + flyMap.getKey();
                        flightAvaible = true;
                    }
                }
            }
        }
        if (flightAvaible) {
            System.out.println("You can fly to " + arrival + " from: " + departures);
            return true;
        } else {
            System.out.println("Theres no flight to choosen destination");
            return false;
        }
    }

    @Override
    public boolean checkWithChange(FlightRequest flightRequest) {
        String departure = flightRequest.getDeparture();
        String arrival = flightRequest.getArrival();
        boolean foundFlight = false;
        String departure2 = "";
        String route = "";

        return false;
    }
}
