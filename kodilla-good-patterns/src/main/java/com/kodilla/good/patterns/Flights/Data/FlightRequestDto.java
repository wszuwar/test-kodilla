package com.kodilla.good.patterns.Flights.Data;

import com.kodilla.good.patterns.Flights.Data.User;

public class FlightRequestDto {
    public User user;
    public boolean isReserved;

    public FlightRequestDto(final User user, final boolean isReserved) {
        this.user = user;
        this.isReserved = isReserved;
    }

    public User getUser() {
        return user;
    }

    public boolean isReserved() {
        return isReserved;
    }
}
