package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryPainting(){
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task painting = task.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        Assert.assertEquals("Paint nicely",painting.getTaskName());
        Assert.assertEquals(true,painting.isTaskExecuted());
    }
    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory task = new TaskFactory();
        //WHen
        Task driving = task.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals("Drive fast",driving.getTaskName());
        Assert.assertEquals(true,driving.isTaskExecuted());
    }
    @Test
    public void testFactoryShopping(){
        //Given
        TaskFactory task = new TaskFactory();
        //WHen
        Task shopping = task.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        Assert.assertEquals("Shopping",shopping.getTaskName());
        Assert.assertEquals(true,shopping.isTaskExecuted());
    }

}
