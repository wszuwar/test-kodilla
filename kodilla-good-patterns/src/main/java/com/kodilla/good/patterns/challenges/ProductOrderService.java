package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        SaleRequestRetriever saleRequestRetriever = new SaleRequestRetriever();
        SaleRequest saleRequest = saleRequestRetriever.retrieve();

        SaleProcesor saleProcesor = new SaleProcesor(new SmsService(),new ProductSellService());
        saleProcesor.process(saleRequest);
    }

}
