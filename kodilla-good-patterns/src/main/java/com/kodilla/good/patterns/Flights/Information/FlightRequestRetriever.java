package com.kodilla.good.patterns.Flights.Information;

import com.kodilla.good.patterns.Flights.Data.FlightRequest;
import com.kodilla.good.patterns.Flights.Data.User;

public class FlightRequestRetriever {
    public FlightRequest retrieve() {
        User user = new User("Czeslaw", "Galka", "czeslaw@spiewa.com");
        String departure = "Stavanger";
        String arrival = "Krakow";

        return new FlightRequest(user, departure, arrival);
    }
}
