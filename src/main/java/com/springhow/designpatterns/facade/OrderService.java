package com.springhow.designpatterns.facade;

import java.util.Random;
import java.util.UUID;

public class OrderService {

    public String createOrder(String product, int price, int count) {
        System.out.println("Created an order for "+product+" x "+count+" for price : "+ price);
        return String.valueOf( new Random().nextInt(2000000));
    }

    public void confirmOrder(String orderNum) {
        System.out.println("Order [" + orderNum + "] confirmed..!");
    }
}
