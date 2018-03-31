package com.kodilla.good.patterns.Flights.Logic;

import com.kodilla.good.patterns.Flights.Services.CheckConnections;
import com.kodilla.good.patterns.Flights.Data.Flight;
import com.kodilla.good.patterns.Flights.Data.FlightRequest;

import java.util.*;
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
        String route = "";
        List<Flight> route2 = new ArrayList<>();

        route = createdMap.stream()
                .filter(s -> s.getDeparture().equals(depature) && s.getArrival().equals(arrival))
                .map(s -> s.getDeparture() + " to " + s.getArrival())
                .collect(Collectors.joining(route));
        if (!route.isEmpty()) {
            System.out.println("Found direct flight : " + route);
            return true;
        } else if (route.isEmpty()) {
            route2 = createdMap.stream()
                    .filter(s -> s.getArrival().equals(arrival))
                    .collect(Collectors.toList());
            if (!route2.isEmpty()) {
                System.out.println("Theres no direct flight checking for flight with change");
                route2.stream()
                        .forEach(s -> System.out.println("Found flight with change from : " + depature +
                                " by " + s.getDeparture() + " to " + s.getArrival()));
                return true;
            }

            }System.out.println("Theres no direct flight checking for flight with change");
            System.out.println("Flight not found");
        return false;
        }
    }























