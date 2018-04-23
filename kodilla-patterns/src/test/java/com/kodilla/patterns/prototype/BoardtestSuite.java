package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardtestSuite {
    @Test
    public void testToString(){
        //Given
        //creating to do taskList
        TaskList listToDo = new TaskList("To Do Tasks");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n-> listToDo.getTasks().add(new Task("To Do Task number " + n)));
        //creating in progres taskList
        TaskList inProgress = new TaskList("In Progress Tasks");
        IntStream.iterate(1,n-> n+1)
                .limit(10)
                .forEach(n-> inProgress.getTasks().add(new Task("In Progress task number " + n)));
        //create done taskList
        TaskList done = new TaskList("Done Tasks");
        IntStream.iterate(1,n-> n+1)
                .limit(10)
                .forEach(n-> done.getTasks().add(new Task("Done Task number " + n)));
        //creating board and assigning the lists
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(inProgress);
        board.getLists().add(done);

        // making shallow clone of object board
        Board clonedBoard = null;

        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making a deep copy of object board
        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDo);
        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);
        Assert.assertEquals(2, board.getLists().size());
        Assert.assertEquals(2, clonedBoard.getLists().size());
        Assert.assertEquals(3, deepClonedBoard.getLists().size());
        Assert.assertEquals(clonedBoard.getLists(), board.getLists());
        Assert.assertNotEquals(deepClonedBoard.getLists(), board.getLists());
    }
}
