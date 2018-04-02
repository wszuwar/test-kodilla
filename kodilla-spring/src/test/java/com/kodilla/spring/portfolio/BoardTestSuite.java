package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //when
        TaskList toDoTask = board.getToDoList();
        toDoTask.addToTaskList("Task to do");
       TaskList inProgress = board.getInProgressList();
        inProgress.addToTaskList("InProgress");
        TaskList done = board.getDoneList();
        done.addToTaskList("Task Done");

        String resultOfAddingTodoTask = toDoTask.getTasks().get(0);
        String resultOfAddingInprogresTask = inProgress.getTasks().get(0);
        String resultOfAddingDoneTask = done.getTasks().get(0);

        //Then
        Assert.assertEquals("Task to do", resultOfAddingTodoTask);
        Assert.assertEquals("InProgress", resultOfAddingInprogresTask);
        Assert.assertEquals("Task Done", resultOfAddingDoneTask);

    }
}
