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
        Continent europe = new Continent();
        europe.addCountry(new Country("Poland",new BigDecimal("38000000")));
        europe.addCountry(new Country("Denmark",new BigDecimal("45000000")));
        europe.addCountry(new Country("Germany",new BigDecimal("20000000")));
        europe.addCountry(new Country("Spain",new BigDecimal("38000000")));
        Continent asia = new Continent();
        asia.addCountry(new Country("Japan",new BigDecimal("25000000")));
        asia.addCountry(new Country("China",new BigDecimal("594000000")));
        Continent northAmerica = new Continent();
        northAmerica.addCountry(new Country("USA",new BigDecimal("650000000")));
        northAmerica.addCountry(new Country("Canada",new BigDecimal("421000000")));
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);
        System.out.println(world.getPeopleQuantity().unscaledValue());
        //When
        BigDecimal totalQuantityOfPpl = new BigDecimal("1831000000");
        //Then
        Assert.assertEquals(totalQuantityOfPpl,world.getPeopleQuantity());



    }
}
