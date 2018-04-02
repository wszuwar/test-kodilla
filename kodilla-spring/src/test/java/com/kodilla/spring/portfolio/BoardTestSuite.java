package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
       //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
       BoardConfig boardConfig = context.getBean(BoardConfig.class);
        //when
          TaskList toDoTask = boardConfig.createTaskList();
        toDoTask.addToTaskList("Task to do");
        Board toDo = boardConfig.createBoard();
        toDo.addTaskToDoList(toDoTask);


        TaskList inProgressTask = boardConfig.createTaskList();
        inProgressTask.addToTaskList("InProgress");
        Board inProgress = boardConfig.createBoard();
        inProgress.addTaskInProgress(inProgressTask);


       TaskList doneTask = boardConfig.createTaskList();
       doneTask.addToTaskList("Task Done");
       Board done = boardConfig.createBoard();
       done.addTaskDoneList(doneTask);


        String resultOfAddingTodoTask = toDo.getToDoList().getTasks().get(0);
        String resultOfAddingInprogresTask = inProgress.getInProgressList().getTasks().get(1);
        String resultOfAddingDoneTask = done.getDoneList().getTasks().get(2);



        //Then
        Assert.assertEquals("Task to do",resultOfAddingTodoTask);
        Assert.assertEquals("InProgress",resultOfAddingInprogresTask);
        Assert.assertEquals("Task Done",resultOfAddingDoneTask);

    }
}
