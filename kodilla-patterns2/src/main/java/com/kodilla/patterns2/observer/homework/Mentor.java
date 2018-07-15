package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String mentorsName;
    private int taskNummber;

    public Mentor(String mentorsName) {
        this.mentorsName = mentorsName;
    }

    @Override
    public void update(Student student) {
        System.out.println(mentorsName + " : New tasks are waiting for you in Queue " + student.getName() +
        "\n" + " (total: " + student.getThetasks().size() + " tasks to check");
        taskNummber++;
    }

    public String getMentorsName() {
        return mentorsName;
    }

    public int getTaskNummber() {
        return taskNummber;
    }
}
