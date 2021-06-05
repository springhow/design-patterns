package com.springhow.designpatterns.facade;

public class Client {
    public static void main(String[] args) {
        CustomerServiceFacade customerServiceFacade = new CustomerServiceFacade();
        String orderNum = customerServiceFacade.placeOrder("shirt", 2, 100, "1234567890123456");
        System.out.println("Order Num = " + orderNum);
    }
}
