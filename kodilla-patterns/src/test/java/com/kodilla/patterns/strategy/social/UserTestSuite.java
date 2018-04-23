package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;


public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User monika = new ZGeneration("Monika Szymula");
        User marek = new YGeneration("Marek Szymula");
        User nikodem = new Millenials("Nikodem Szymula");

        //When
        String tweeterPublisher = monika.sharePost();
        System.out.println("Monika " + tweeterPublisher);
        String snapchatPublisher = marek.sharePost();
        System.out.println("Marek " + snapchatPublisher);
        String facebookPublisher = nikodem.sharePost();
        System.out.println("Nikodem " + facebookPublisher);

        // Then
        Assert.assertEquals("At this moment is using Tweeter", tweeterPublisher);
        Assert.assertEquals("At this moment is using Snapchat", snapchatPublisher);
        Assert.assertEquals("At this moment is using Facebook", facebookPublisher);

    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        User marek = new YGeneration("Marek Szymula");

        //When
        String isUsing = marek.sharePost();
        System.out.println("Marek " + isUsing);
        marek.setPostPublisher(new FacebookPublisher());
        isUsing = marek.sharePost();
        System.out.println("Marek changed publisher and " + isUsing);

        //Then
        Assert.assertEquals("At this moment is using Facebook", isUsing);
    }
}
