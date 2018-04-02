package com.kodilla.spring.portfolio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("ToDoList")
    TaskList toDoList;

    @Autowired
    @Qualifier("InProgressList")
    TaskList inProgress;

    @Autowired
    @Qualifier("DoneList")
    TaskList done;

    @Bean
    public Board createBoard() {
        return new Board(toDoList, inProgress, done);
    }

    @Scope("prototype")
    @Bean("ToDoList")
    public TaskList createToDoList() {
        return new TaskList();
    }

    @Scope("prototype")
    @Bean("InProgressList")
    public TaskList createInProgressList() {
        return new TaskList();
    }

    @Scope("prototype")
    @Bean("DoneList")
    public TaskList createDoneList() {
        return new TaskList();
    }


}
