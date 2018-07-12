package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(5.00),calculatedCost);
        }
        @Test
    public void testBasicTaxiOrderGetDescription(){
        //Given
            TaxiOrder theOrder = new BasicTaxiOrder();
            //When
            String description = theOrder.getDescription();
            //Then
            assertEquals("Drive a course",description);
        }
        @Test
    public void testTaxiNetworkGetCost(){
        //Given
            TaxiOrder theOrder = new BasicTaxiOrder();
            theOrder = new TaxiNetworkOrderDecorator(theOrder);
            //When
            BigDecimal theCost = theOrder.getCost();
            //Then
            assertEquals(new BigDecimal(40),theCost);
        }
        @Test
    public void testTaxiNetworkGetDescription(){
        //Given
            TaxiOrder theOrder = new BasicTaxiOrder();
            theOrder = new TaxiNetworkOrderDecorator(theOrder);
            //When
            String description = theOrder.getDescription();
            //Then
            assertEquals("Drive a course by Taxi Network",description);
        }
        @Test
    public void testMyTaxiWithChildSeatGetCost(){
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
            BigDecimal cost = theOrder.getCost();
            //Then
            assertEquals(new BigDecimal(37),cost);
        }
        @Test
    public void testMyTaxiWithChildSeatGetDescription(){
        //Given
            TaxiOrder theOrder = new BasicTaxiOrder();
            theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
            theOrder = new ChildSeatDecorator(theOrder);
            //When
            String description = theOrder.getDescription();
            //Then
            assertEquals("Drive a course by MyTaxi Network + child seat",description);
        }
        @Test
    public void testUberWithTwoChildSeatsGetDescription(){
        //Given
            TaxiOrder theOrder = new BasicTaxiOrder();
            theOrder = new UberNetworkOrderDecorator(theOrder);
            theOrder = new ChildSeatDecorator(theOrder);
            theOrder = new ChildSeatDecorator(theOrder);
            //When
            String theDescription = theOrder.getDescription();
            //Then
            assertEquals("Drive a course by Uber Network + child seat + child seat",theDescription);
        }
        @Test
    public void testVipTaxiWithChildSeatExpressGetCost(){
        //Given
            TaxiOrder theOrder = new BasicTaxiOrder();
            theOrder = new VipDecorator(theOrder);
            theOrder = new ExpressDecorator(theOrder);
            theOrder = new ChildSeatDecorator(theOrder);
            System.out.println(theOrder.getCost());
            //When
            BigDecimal cost = theOrder.getCost();
            //Then
           assertEquals(new BigDecimal(22),cost);
        }
        @Test
    public void testVipTaxiWithChildSeatExpressGetDescription(){
        //Given
            TaxiOrder theOrder = new BasicTaxiOrder();
            theOrder = new UberNetworkOrderDecorator(theOrder);
            theOrder = new VipDecorator(theOrder);
            theOrder = new ExpressDecorator(theOrder);
            theOrder = new ChildSeatDecorator(theOrder);
            System.out.println(theOrder.getDescription());
            //When
            String description = theOrder.getDescription();
            //Then
            assertEquals("Drive a course by Uber Network vatiant VIP express service + child seat",description);
        }



}
