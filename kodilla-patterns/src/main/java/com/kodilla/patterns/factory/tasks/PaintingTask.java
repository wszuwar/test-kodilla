package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    final String taskName, color, whatToPaint;
    private boolean isExecuted;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Gooing to " + getTaskName() + " " + whatToPaint + " with " + color + " color paint");
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
