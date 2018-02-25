package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    ArrayList<String> usersNames = new ArrayList<>();
    public ArrayList<String> createUserNames (int usersCount) {

        for (int i = 0; i < usersCount; i++) {
            String name = "Roman";
            usersNames.add(name);
        }return usersNames;
    }


    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testStatistics01() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        Statistic statistic = new Statistic();

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        statistic.calculateAdvStatistics(statisticsMock);
        statistic.showStatistics();
        //When
        double postsAveragePerUser = statistic.getAvgPostsPerUser();
        double commentsAveragePerUser = statistic.getAvgCommentsPerPost();
        double commentsAveragePerPost = statistic.getAvgCommentsPerPost();

        //Then
        Assert.assertEquals(0, postsAveragePerUser, 0);
        Assert.assertEquals(0, commentsAveragePerUser, 0);
        Assert.assertEquals(0, commentsAveragePerPost, 0);
    }

    @Test
    public void testStatistics02() {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        Statistic statistic = new Statistic();

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        statistic.calculateAdvStatistics(statisticsMock);
        statistic.showStatistics();
        //When
        double postsAveragePerUser = statistic.getAvgPostsPerUser();
        double commentsAveragePerUser = statistic.getAvgCommentsPerPost();
        double commentsAveragePerPost = statistic.getAvgCommentsPerPost();
        //Then
        Assert.assertEquals(0, postsAveragePerUser, 0);
        Assert.assertEquals(0, commentsAveragePerUser, 0);
        Assert.assertEquals(0, commentsAveragePerPost, 0);
    }

    @Test
    public void testStatistics03() {
        //Given
        usersNames=createUserNames(50);
        Statistics statisticsMock = mock(Statistics.class);
        Statistic statistic = new Statistic();

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(200);

        statistic.calculateAdvStatistics(statisticsMock);
        statistic.showStatistics();

        //When
            double postsAveragePerUser = statistic.getAvgPostsPerUser();
            double commentsAveragePerUser = statistic.getAvgCommentsPerUser();
            double commentsAveragePerPost = statistic.getAvgCommentsPerPost();
            //Then
        Assert.assertEquals(2,postsAveragePerUser,0);
        Assert.assertEquals(4,commentsAveragePerUser,0);
        Assert.assertEquals(2.0,commentsAveragePerPost,0);
        }
        @Test
    public void testStatistics04(){
        //Given

            usersNames=createUserNames(100);
            Statistics statisticsMock = mock(Statistics.class);
            Statistic statistic = new Statistic();


            when(statisticsMock.postsCount()).thenReturn(400);
            when(statisticsMock.commentsCount()).thenReturn(200);
            when(statisticsMock.usersNames()).thenReturn(usersNames);

            statistic.calculateAdvStatistics(statisticsMock);
            statistic.showStatistics();
            //When
            double postsAveragePerUser = statistic.getAvgPostsPerUser();
            double commentsAveragePerUser = statistic.getAvgCommentsPerUser();
            double commentsAveragePerPost = statistic.getAvgCommentsPerPost();
            //Then
            Assert.assertEquals(4,postsAveragePerUser,0);
            Assert.assertEquals(2,commentsAveragePerUser,0);
            Assert.assertEquals(0.5,commentsAveragePerPost,0);
        }
    }

