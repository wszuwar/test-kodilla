package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public void addTaskToDoList(TaskList task) {
        toDoList = task;
    }

    public void addTaskInProgress(TaskList task) {
        inProgressList = task;
    }

    public void addTaskDoneList(TaskList task) {
        doneList = task;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
