package com.kodilla.testing.TestTesting01;

import com.kodilla.testing.calculator.Testing01;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Testing01TestSuite {


    @Test
    public void test01(){
        //Given
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,6,7,8,9);
        Testing01 testing01 = new Testing01();
        //When
       int result =  testing01.showDuplicate(list) ;
        //Then
        Assert.assertEquals(6,result);
    }
    @Test
    public void  test02(){

        //Given
        List<Integer> list = Arrays.asList(1,2,2,3,4,5,6,7,8,9);
        Testing01 testing01 = new Testing01();
        //When
        int result =  testing01.showDuplicate(list) ;
        //Then
        Assert.assertEquals(2,result);
    }
    @Test
    public void  test03(){

        //Given
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,9);
        Testing01 testing01 = new Testing01();
        //When
        int result =  testing01.showDuplicate(list) ;
        //Then
        Assert.assertEquals(9,result);
    }

}
