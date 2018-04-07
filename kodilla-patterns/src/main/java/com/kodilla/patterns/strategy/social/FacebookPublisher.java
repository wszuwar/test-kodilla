package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "At this moment is using Facebook";
    }
}
