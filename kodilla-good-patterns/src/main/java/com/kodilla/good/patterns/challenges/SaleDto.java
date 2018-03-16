package com.kodilla.good.patterns.challenges;

public class SaleDto {
    public User user;
    public boolean isAvailable;

    public SaleDto(final User user, final boolean isAvailable) {
        this.user = user;
        this.isAvailable = isAvailable;
    }

    public User getUser() {
        return user;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
