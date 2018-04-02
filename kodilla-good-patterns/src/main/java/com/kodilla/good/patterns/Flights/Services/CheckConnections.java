package com.kodilla.good.patterns.Flights.Services;

import com.kodilla.good.patterns.Flights.Data.FlightRequest;

public interface CheckConnections {
    boolean checkDeparture(FlightRequest flightRequest);
    boolean checkArival(FlightRequest flightRequest);
    boolean checkWithChange(FlightRequest flightRequest);
}
