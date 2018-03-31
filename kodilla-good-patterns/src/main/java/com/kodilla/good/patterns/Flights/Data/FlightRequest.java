package com.kodilla.good.patterns.Flights.Data;

import com.kodilla.good.patterns.Flights.Data.User;

public class FlightRequest {
    private User user;
    private String departure;
    private String arrival;

    public FlightRequest(User user, String departure, String arrival) {
        this.user = user;
        this.departure = departure;
        this.arrival = arrival;
    }

    public User getUser() {
        return user;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }
    @Override
    public String toString() {
        return "FlightRequest: " + user + " from: " + departure + " to: " + arrival;
    }
}
