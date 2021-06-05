package com.springhow.designpatterns.facade;

public class StockService {

    public boolean isAvailable(String product, int count) {
        if (product.contains("s")) {
            System.out.println("The product is available");
            return true;
        }
        System.out.println("The product is not available");
        return false;
    }

    public void adjustStock(String product, int count) {
        System.out.println("Product [" + product + "] is reduced by [" + count + "]");
    }
}
