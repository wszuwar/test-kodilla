package com.kodilla.good.patterns.challenges;

public class ProductSellService implements SaleService {

    @Override
    public boolean selling(Product product, User user, int ammount) {
        if (product != null) {
            System.out.println(" Selling " + product.getName() + " to user " + user.getName() + " " + user.getLastName()
                    + " in ammount of " + ammount + " for price" + product.getPrice()*ammount);
            return true;
        } else {
            System.out.println(" Product is not available ");
            return false;
        }
    }
}
