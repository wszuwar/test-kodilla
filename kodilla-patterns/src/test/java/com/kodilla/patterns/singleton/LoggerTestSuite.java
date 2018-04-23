package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;
import singleton.Logger;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog(){
        //Given
        Logger.getInstance().log("this is 1st log");
        Logger.getInstance().log("This is second log");
        Logger.getInstance().log("This is last log");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("This is last log",result);
    }
}
