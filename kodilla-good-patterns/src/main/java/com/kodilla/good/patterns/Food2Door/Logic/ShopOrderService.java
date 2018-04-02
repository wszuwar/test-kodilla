package com.kodilla.good.patterns.Food2Door.Logic;

import com.kodilla.good.patterns.Food2Door.Product;
import com.kodilla.good.patterns.Food2Door.Services.OrderService;
import com.kodilla.good.patterns.Food2Door.Shop;
import com.kodilla.good.patterns.Food2Door.User;

public class ShopOrderService implements OrderService {
    @Override
    public boolean ordering(Product product, Shop shop, User user, int ammount) {
        if (product != null && shop != null) {
            System.out.println("Selling " + product.getName() + " from shop " + shop.getName() + " to user " + user.getName()
                    + " in ammount of " + ammount + " for price " + product.getPrice() * ammount);
            return true;
        }
        System.out.println("Product or Shop is not available");
        return false;
    }
}
