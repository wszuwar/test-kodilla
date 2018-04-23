package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .Burgers(2)
                .Roll("No Sezam")
                .Sause("Ketchup")
                .ingredient("Becon")
                .ingredient("Tomato")
                .ingredient("Salad")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3,howManyIngredients);
    }
}
