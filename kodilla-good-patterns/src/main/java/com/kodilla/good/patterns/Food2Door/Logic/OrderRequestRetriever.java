package com.kodilla.good.patterns.Food2Door.Logic;

import com.kodilla.good.patterns.Food2Door.*;

public class OrderRequestRetriever {

    public OrderRequest retrievier(){
        Product product = new Bread("Gluten Free Bread",52);
        Shop shop = new GlutenFreeShop("Rema 1000");
        User user = new User("Roman","Czarnobyl",997);
        int ammount = 3;
        return new OrderRequest(product,shop,user,ammount);
    }
}
