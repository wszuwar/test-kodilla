package com.kodilla.good.patterns.Flights;

public class Application {
    public static void main(String[] args) {
        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        FlightRequest flightRequest = flightRequestRetriever.retrieve();

        FlightProcesor flightProcesor = new FlightProcesor(new MailService(),new FlightRequestRepositoryService(),
                new FlightRequestService(), new ConnectionsChecker());
        flightProcesor.process(flightRequest);
    }

}
