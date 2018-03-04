package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite implements ArrayOperations {

    @Test
    public void testGetAverage(){
        //Given
        int[] array = new int[65];

        //When
        for (int i = 1; i < array.length; i++){
            array[i] = i;
            System.out.println(array[i]);
        }
      double expectedAverage = ArrayOperations.getAverage(array);
        double average=0;
        for (double n:array){
            average+=array[(int) n];
            }
        average = average/array.length;

        //Then
        Assert.assertEquals(average,expectedAverage,0);



    }
}
