package com.kodilla.good.patterns.Flights;

public interface CheckConnections {
    boolean checkDeparture(FlightRequest flightRequest);
    boolean checkArival(FlightRequest flightRequest);
    boolean checkWithChange(FlightRequest flightRequest);
}
