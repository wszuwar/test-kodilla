package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Student implements Observable{
    private final String name;
    private final Queue<Task> thetasks;
    private final List<Mentor> mentors;

    public Student(String name) {
        this.name = name;
        thetasks = new ArrayDeque<>();
        mentors = new ArrayList<>();

    }
    public void addTask(Task task){
        thetasks.add(task);
        notifyObserver();
    }

    @Override
    public void registerObserver(Mentor mentor) {
        mentors.add(mentor);
    }

    @Override
    public void notifyObserver() {
        for (Mentor mentor : mentors){
            mentor.update(this);
        }

    }

    @Override
    public void removeObserver(Mentor mentor) {
        mentors.remove(mentor);
    }

    public String getName() {
        return name;
    }

    public Queue<Task> getThetasks() {
        return thetasks;
    }
}
