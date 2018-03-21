package com.kodilla.good.patterns.Food2Door.Logic;


import com.kodilla.good.patterns.Food2Door.*;

import java.util.HashMap;


public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever(new HashMap<>());
        orderRequestRetriever.getProductShopHashMap().put((new Bread("Gluten Free Bread", 52)), new GlutenFreeShop("rema 1000"));
        OrderRequest orderRequest = orderRequestRetriever.retrievier();

        OrderProcesor orderProcesor = new OrderProcesor(new SmsService(),new ShopOrderService());
        orderProcesor.process(orderRequest);

    }
}
