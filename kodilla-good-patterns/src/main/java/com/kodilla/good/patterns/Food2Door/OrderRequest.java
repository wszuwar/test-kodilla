package com.kodilla.good.patterns.Food2Door;




public class OrderRequest {
    private Product product;
    private Shop shop;
    private User user;
    private int ammount;

    public OrderRequest(final Product product, final Shop shop, final User user, final int ammount) {
        this.product = product;
        this.shop = shop ;
        this.user = user;
        this.ammount = ammount;
    }

    public Product getProduct() {
        return product;
    }

    public Shop getShop() {
        return shop;
    }

    public User getUser() {
        return user;
    }

    public int getAmmount() {
        return ammount;
    }
}
