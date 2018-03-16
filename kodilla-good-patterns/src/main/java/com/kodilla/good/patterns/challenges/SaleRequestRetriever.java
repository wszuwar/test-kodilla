package com.kodilla.good.patterns.challenges;

public class SaleRequestRetriever {

    public SaleRequest retrieve() {

        Product product = new Book("Harry Potter",25.5);
        User user = new User("Cezary", "Owczarek");
        int ammount = 3;

        return new SaleRequest(product, user, ammount);
    }

}
