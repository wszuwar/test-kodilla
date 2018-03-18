package com.kodilla.good.patterns.Food2Door.Logic;

import com.kodilla.good.patterns.Food2Door.OrderDto;
import com.kodilla.good.patterns.Food2Door.OrderRequest;
import com.kodilla.good.patterns.Food2Door.Services.InformationService;
import com.kodilla.good.patterns.Food2Door.Services.OrderService;

public class OrderProcesor {
    private InformationService informationService;
    private OrderService orderService;

    public OrderProcesor(final InformationService informationService, final OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }
    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.ordering(orderRequest.getProduct(),orderRequest.getShop(),orderRequest.getUser(),orderRequest.getAmmount());
        if (isOrdered){
            informationService.sendingMessage(orderRequest.getUser());
            orderService.ordering(orderRequest.getProduct(),orderRequest.getShop(),orderRequest.getUser(),orderRequest.getAmmount());
            return new OrderDto(orderRequest.getUser(),true);
        }
        else {
            return new OrderDto(orderRequest.getUser(),false);
        }
    }
}
