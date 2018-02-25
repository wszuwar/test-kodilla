package com.kodilla.testing.forum.statistics;

public class Statistic {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;
    Statistics statistics;

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount !=0){
            avgPostsPerUser = postsCount /usersCount;
            avgCommentsPerUser = commentsCount / usersCount;
        } else {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
        }

        if (postsCount != 0){
            avgCommentsPerPost = commentsCount / postsCount;

        }else {
            avgCommentsPerPost = 0;
        }

    }


    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }



        public void showStatistics(){
            System.out.println("Statstics: \n" +
            "Number of Users: "+ getUsersCount() + "\n" +
            "Number of Posts: "+ getPostsCount() + "\n" +
            "Number of Comments: "+ getCommentsCount() + "\n" +
            "Average amount of posts per User: "+ getAvgPostsPerUser() + "\n" +
            "Average amount of Comments per User: "+ getAvgCommentsPerUser() + "\n" +
            "Average amount of Comments per Post: "+ getAvgCommentsPerPost());
        }

}
