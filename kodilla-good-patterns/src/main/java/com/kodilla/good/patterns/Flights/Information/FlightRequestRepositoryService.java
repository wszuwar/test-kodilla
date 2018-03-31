package com.kodilla.good.patterns.Flights.Information;

import com.kodilla.good.patterns.Flights.Data.FlightRequest;
import com.kodilla.good.patterns.Flights.Services.RequestRepositoryService;

public class FlightRequestRepositoryService implements RequestRepositoryService {
    @Override
    public boolean creatingRequest(FlightRequest flightRequest) {
        System.out.println("creating Flight Request for :" + flightRequest.getUser().getName()
                +" "+ flightRequest.getUser().getLastName() + " from " + flightRequest.getDeparture()
                + " to " + flightRequest.getArrival());
        return true;
    }
}
