package com.kodilla.good.patterns.Food2Door;




import java.util.HashMap;

import java.util.Map;



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
        Shop shop = null;

        for (Map.Entry<Product, Shop> p : productShopHashMap.entrySet()) {
            product = p.getKey();
            shop = p.getValue();
        }

        User user = new User("Roman", "Czarnobyl", 997);
        int ammount = 3;

        return new OrderRequest(product, shop, user, ammount);
    }
}
