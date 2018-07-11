package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OltedalPizzaDecorator extends AbstractPizzaOrderDecorator{
    protected OltedalPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " from pizza house in Oltedal";
    }
}
