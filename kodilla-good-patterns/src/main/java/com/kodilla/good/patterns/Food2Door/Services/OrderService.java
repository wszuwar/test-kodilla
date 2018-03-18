package com.kodilla.good.patterns.Food2Door.Services;

import com.kodilla.good.patterns.Food2Door.Product;
import com.kodilla.good.patterns.Food2Door.Shop;
import com.kodilla.good.patterns.Food2Door.User;

public interface OrderService {
    boolean ordering(Product product, Shop shop, User user, int ammount);
}
