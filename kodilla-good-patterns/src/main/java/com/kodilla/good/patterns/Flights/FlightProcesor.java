package com.kodilla.good.patterns.Flights;

public class FlightProcesor {
    private InformationService informationService;
    private RequestRepositoryService requestRepositoryService;
    private RequestService requestService;
    private CheckConnections checkConnections;

    public FlightProcesor(final InformationService informationService, final RequestRepositoryService requestRepositoryService,
                          final RequestService requestService, final CheckConnections checkConnections) {
        this.informationService = informationService;
        this.requestRepositoryService = requestRepositoryService;
        this.requestService = requestService;
        this.checkConnections = checkConnections;
    }
    public FlightRequestDto process(final FlightRequest flightRequest){
        boolean isFound = checkConnections.checkWithChange(flightRequest);
        if (isFound){
            informationService.sendMessage(flightRequest.getUser());
            requestRepositoryService.creatingRequest(flightRequest);
            return new FlightRequestDto(flightRequest.getUser(),true);
        }else {
            return new FlightRequestDto(flightRequest.getUser(),false);
        }
    }
}
