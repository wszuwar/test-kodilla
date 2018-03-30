package com.kodilla.good.patterns.Flights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;


public class ConnectionsChecker implements CheckConnections {
    FlightMapCreator flightMapCreator = new FlightMapCreator();
    public HashSet<Flight> createdMap = flightMapCreator.mapCreator();

    @Override
    public boolean checkDeparture(FlightRequest flightRequest) {
        String departure = flightRequest.getDeparture();
        String arrival = "";

        arrival = createdMap.stream()
                .filter(s -> s.getDeparture().equals(departure))
                .map(s -> s.getArrival())
                .collect(Collectors.joining(", ", " All airports available from " + departure + ": ", "."));
        if (!arrival.isEmpty()) {
            System.out.println(arrival);
            return true;
        } else {
            System.out.println("No airports avaible from this departure ");
            return false;
        }
    }

    @Override
    public boolean checkArival(FlightRequest flightRequest) {
        String arrival = flightRequest.getArrival();
        String departures = "";

        departures = createdMap.stream()
                .filter(s -> s.getArrival().equals(arrival))
                .map(s -> s.getDeparture())
                .collect(Collectors.joining(", ", " All airports with connections to " + arrival + ": ", "."));
        if (!departures.isEmpty()) {
            System.out.println(departures);
            return true;
        } else {
            System.out.println("Theres no connection to this airport");
            return false;
        }
    }

    @Override
    public boolean checkWithChange(FlightRequest flightRequest) {
        String depature = flightRequest.getDeparture();
        String arrival = flightRequest.getArrival();
        HashSet<Flight> route = createdMap;
        HashSet<Flight> route2 = createdMap;

        route.stream()
                .filter(s -> s.getDeparture().equals(depature) && s.getArrival().equals(arrival))
                .forEach(s-> System.out.println("Found Direct flight From : " + depature + " to " + arrival));
        if (route.contains(arrival)) {
            System.out.println(route);
            return true;
        } else if (route.isEmpty()) {
            route2.stream()
                    .filter(s -> s.getArrival().equals(arrival))
                    .forEach(s -> System.out.println("Found flight with change: " + depature + " to " + s.getDeparture() + " to " + arrival));
        }
            if (!route2.contains(arrival)) {
                System.out.println(route2);
                return true;
            }
                System.out.println("Sorry! Flight not found");
                return false;
            }
        }



