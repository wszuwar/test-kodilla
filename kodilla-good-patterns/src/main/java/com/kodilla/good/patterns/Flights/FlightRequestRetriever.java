package com.kodilla.good.patterns.Flights;

public class FlightRequestRetriever {
    public FlightRequest retrieve() {
        User user = new User("Czeslaw", "Galka", "czeslaw@spiewa.com");
        String departure = "Gdansk";
        String arrival = "Stavanger";

        return new FlightRequest(user, departure, arrival);
    }
}
