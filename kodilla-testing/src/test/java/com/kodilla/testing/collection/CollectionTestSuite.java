package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test case: begin");
    }
    @After
    public void after(){
        System.out.println("Test case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> givenList = new ArrayList<>();


        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(givenList);
        //Then
        Assert.assertTrue(result.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> givenNumbers = new ArrayList<>();
        givenNumbers.add(2);
        givenNumbers.add(5);
        givenNumbers.add(6);
        givenNumbers.add(7);
        givenNumbers.add(8);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(6);
        evenNumbers.add(8);
        //When

        ArrayList<Integer> result = oddNumbersExterminator.exterminate(givenNumbers);
        //Then
        Assert.assertEquals(evenNumbers,result);

    }

}
