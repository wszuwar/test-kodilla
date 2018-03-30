package com.kodilla.good.patterns.Flights;

public class FlightRequestService implements RequestService {
    @Override
    public boolean creatingRequest(FlightRequest flightRequest) {
        System.out.println("creating Flight Request for :" + flightRequest.getUser().getName()
                +" "+ flightRequest.getUser().getLastName() + " from " + flightRequest.getDeparture()
                + "to" + flightRequest.getArrival());
        return true;
    }
}
