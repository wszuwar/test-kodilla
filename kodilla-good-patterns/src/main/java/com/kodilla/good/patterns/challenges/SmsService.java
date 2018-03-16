package com.kodilla.good.patterns.challenges;

public class SmsService implements InformationService {
    @Override
    public void sendingMessage(User user) {
        System.out.println("sending message to " + user.getLastName()+ " " + user.getLastName());
    }
}
