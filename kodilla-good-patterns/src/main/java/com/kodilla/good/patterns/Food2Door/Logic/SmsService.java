package com.kodilla.good.patterns.Food2Door.Logic;

import com.kodilla.good.patterns.Food2Door.Services.InformationService;
import com.kodilla.good.patterns.Food2Door.User;

public class SmsService implements InformationService {
    @Override
    public void sendingMessage(User user) {
        System.out.println("Sending message to " + user.getName() + "" + user.getLastName()
                + " on phone number: " + user.getPhoneNumber());
    }
}
