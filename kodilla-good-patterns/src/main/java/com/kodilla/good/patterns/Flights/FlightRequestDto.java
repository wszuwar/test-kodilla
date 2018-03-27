package com.kodilla.good.patterns.Flights;

import javax.jws.soap.SOAPBinding;

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
