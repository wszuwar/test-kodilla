package com.kodilla.good.patterns.Flights.Information;

import com.kodilla.good.patterns.Flights.Data.User;
import com.kodilla.good.patterns.Flights.Services.InformationService;

public class MailService implements InformationService {
    @Override
    public void sendMessage(User user) {
        System.out.println("sending message to :"+ user.getName()+" "+ user.getLastName()+ " on email adress: "+ user.getEmail());
    }
}
