package com.kodilla.good.patterns.Flights;

public class FlightRequestRetriever {
    public FlightRequest retrieve() {
        User user = new User("Czeslaw", "Galka", "czeslaw@spiewa.com");
        String departure = "Stavanger";
        String arrival = "Krakow";

        return new FlightRequest(user, departure, arrival);
    }
}
