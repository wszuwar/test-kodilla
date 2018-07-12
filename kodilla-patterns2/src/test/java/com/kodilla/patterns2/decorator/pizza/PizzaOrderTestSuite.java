package com.kodilla.patterns2.decorator.pizza;


import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15),cost);
    }
    @Test
    public void testBasicPizzaOrderDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order a pizza with :pizza dough, tomato sauce, cheese",description);
    }
    @Test
    public void testHamMushroomExtraCheeseOltedalPizzaCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new ExtraCheesePizzaDecorator(theOrder);
        theOrder = new OltedalPizzaDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(31),cost);
    }
    @Test
    public void testPepperExtraCheesseStavangerPizzaDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperPizzaDecorator(theOrder);
        theOrder = new ExtraCheesePizzaDecorator(theOrder);
        theOrder = new StavangerPizzaDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order a pizza with :pizza dough,tomato sauce,cheese,pepper,extra cheese from pizza house Stavanger",description);
    }

}
