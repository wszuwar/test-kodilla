package com.kodilla.good.patterns.challenges;

import javax.jws.soap.SOAPBinding;

public class SaleRequest {
    private Product product;
    private User user;
    private int ammount;

    public SaleRequest(final Product product, final User user,final int ammount) {
        this.user = user;
        this.product = product;
        this.ammount = ammount;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public int getAmmount() {
        return ammount;
    }
}
