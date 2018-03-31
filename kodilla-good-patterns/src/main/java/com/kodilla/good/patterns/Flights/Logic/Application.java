package com.kodilla.good.patterns.Flights.Logic;

import com.kodilla.good.patterns.Flights.Data.FlightRequest;
import com.kodilla.good.patterns.Flights.Information.FlightRequestRepositoryService;
import com.kodilla.good.patterns.Flights.Information.FlightRequestRetriever;
import com.kodilla.good.patterns.Flights.Information.FlightRequestService;
import com.kodilla.good.patterns.Flights.Information.MailService;

public class Application {
    public static void main(String[] args) {
        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        FlightRequest flightRequest = flightRequestRetriever.retrieve();

        FlightProcesor flightProcesor = new FlightProcesor(new MailService(),new FlightRequestRepositoryService(),
                new FlightRequestService(), new ConnectionsChecker());
        flightProcesor.process(flightRequest);
    }

}
