package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.*;

import java.util.HashMap;
import java.util.Set;


public class OrderRequestRetriever {
    private HashMap<Product, Shop> productShopHashMap;

    public OrderRequestRetriever(HashMap<Product, Shop> productShopHashMap) {
        this.productShopHashMap = productShopHashMap;
    }

    public HashMap<Product, Shop> getProductShopHashMap() {
        return productShopHashMap;
    }


    public OrderRequest retrievier() {
        Product product = null;
        Set<Product> products = productShopHashMap.keySet();
        for (Product p : products){
            product = p;
        }

                User user = new User("Roman", "Czarnobyl", 997);
        int ammount = 3;

        return new OrderRequest(product,productShopHashMap.get(product), user, ammount);
    }
}
