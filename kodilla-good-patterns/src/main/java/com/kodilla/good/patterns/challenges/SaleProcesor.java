package com.kodilla.good.patterns.challenges;

public class SaleProcesor {
    private InformationService informationService;
    private SaleService saleService;

    public SaleProcesor(final InformationService informationService, final SaleService saleService) {
        this.informationService = informationService;
        this.saleService = saleService;
    }

    public SaleDto process(final SaleRequest saleRequest) {
        boolean isAvailable = saleService.selling(saleRequest.getProduct(), saleRequest.getUser(), saleRequest.getAmmount());
        if (isAvailable) {
            informationService.sendingMessage(saleRequest.getUser());
            saleService.selling(saleRequest.getProduct(), saleRequest.getUser(), saleRequest.getAmmount());
            return new SaleDto(saleRequest.getUser(), true);

        } else {
            return new SaleDto(saleRequest.getUser(), false);
        }
    }
}

