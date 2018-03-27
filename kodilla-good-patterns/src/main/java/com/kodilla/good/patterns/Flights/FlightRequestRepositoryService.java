package com.kodilla.good.patterns.Flights;

public class FlightRequestRepositoryService implements RequestRepositoryService {
    @Override
    public boolean creatingRequest(FlightRequest flightRequest) {
        System.out.println("creating Flight Request for :" + flightRequest.getUser() + "from" + flightRequest.getDeparture()
                + "to" + flightRequest.getArrival());
        return true;
    }
}
