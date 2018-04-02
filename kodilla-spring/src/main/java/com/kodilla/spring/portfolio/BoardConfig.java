package com.kodilla.spring.portfolio;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board createBoard(){
        return new Board();
    }
    @Bean
    public TaskList createTaskList(){
        return new TaskList();
    }


}
