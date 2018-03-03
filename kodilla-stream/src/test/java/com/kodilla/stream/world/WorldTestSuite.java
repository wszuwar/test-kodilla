package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent Europe = new Continent();
        Europe.addCountry(new Country("Poland",new BigDecimal("38000000")));
        Europe.addCountry(new Country("Denmark",new BigDecimal("45000000")));
        Europe.addCountry(new Country("Germany",new BigDecimal("20000000")));
        Europe.addCountry(new Country("Spain",new BigDecimal("38000000")));
        Continent Asia = new Continent();
        Asia.addCountry(new Country("Japan",new BigDecimal("25000000")));
        Asia.addCountry(new Country("China",new BigDecimal("594000000")));
        Continent NorthAmerica = new Continent();
        NorthAmerica.addCountry(new Country("USA",new BigDecimal("650000000")));
        NorthAmerica.addCountry(new Country("Canada",new BigDecimal("421000000")));
        world.addContinent(Europe);
        world.addContinent(Asia);
        world.addContinent(NorthAmerica);
        System.out.println(world.getPeopleQuantity().unscaledValue());
        //When
        BigDecimal totalQuantityOfPpl = new BigDecimal("1831000000");
        //Then
        Assert.assertEquals(totalQuantityOfPpl,world.getPeopleQuantity());



    }
}
