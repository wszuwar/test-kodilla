package com.kodilla.patterns.factory.tasks;

public final class Driving implements Task {
    final String taskName, where, using;
    boolean isExecuted;

    public Driving(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Gooing to " + getTaskName() + " to " + where + "  by " + using);
        isExecuted = true;

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
     return isExecuted;
    }
}
