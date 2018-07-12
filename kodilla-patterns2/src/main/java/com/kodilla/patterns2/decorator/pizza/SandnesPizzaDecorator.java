package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SandnesPizzaDecorator extends AbstractPizzaOrderDecorator{
    protected SandnesPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " from pizza house Sandnes";
    }
}
