package com.kodilla.stream.immutable;

public final class ForumUser {
    private String userName;
    private String realUserName;

    public ForumUser(final String userName,final String realUserName) {
        this.userName = userName;
        this.realUserName = realUserName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealUserName() {
        return realUserName;
    }
}
