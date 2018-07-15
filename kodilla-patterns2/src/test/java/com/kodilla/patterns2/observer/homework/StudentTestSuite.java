package com.kodilla.patterns2.observer.homework;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTestSuite {
    @Test
    public void testUpdate(){
        //Given
        Student romanCzaszka = new Student("Roman Czaszka");
        Student monikaDomagala = new Student("Monika Domagala");
        Mentor montorPawel = new Mentor("Pawel Najlepszy");
        Mentor mentorArek = new Mentor("Arkadius Cykada");
        Mentor mentorDamian = new Mentor("Damian Duda");
        romanCzaszka.registerObserver(montorPawel);
        monikaDomagala.registerObserver(mentorArek);
        romanCzaszka.registerObserver(mentorDamian);
        monikaDomagala.registerObserver(mentorDamian);
        Task task1 = new Task("build Observer pattern");
        Task task2 = new Task("Finish REST API project");
        Task task3 = new Task("Deploy you application on Heroku");
         //When
        romanCzaszka.addTask(task1);
        romanCzaszka.addTask(task2);
        monikaDomagala.addTask(task1);
        monikaDomagala.addTask(task3);
        romanCzaszka.addTask(task3);
        //Then
        assertEquals(3,montorPawel.getTaskNummber());
        assertEquals(2,mentorArek.getTaskNummber());
        assertEquals(5,mentorDamian.getTaskNummber());
    }
}
