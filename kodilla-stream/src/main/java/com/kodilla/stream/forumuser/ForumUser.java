package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.Date;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(final int userId,final String userName,final char sex,final int year,final int month,final int day,final int numberOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(year,month,day);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }

}
