package com.kodilla.good.patterns.Food2Door.Logic;

import com.kodilla.good.patterns.Food2Door.Logic.OrderProcesor;
import com.kodilla.good.patterns.Food2Door.Logic.OrderRequestRetriever;
import com.kodilla.good.patterns.Food2Door.Logic.ShopOrderService;
import com.kodilla.good.patterns.Food2Door.Logic.SmsService;
import com.kodilla.good.patterns.Food2Door.OrderRequest;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrievier();

        OrderProcesor orderProcesor = new OrderProcesor(new SmsService(),new ShopOrderService());
        orderProcesor.process(orderRequest);

    }
}
