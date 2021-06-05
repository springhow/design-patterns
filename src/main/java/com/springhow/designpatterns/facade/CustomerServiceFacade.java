package com.springhow.designpatterns.facade;

public class CustomerServiceFacade {

    private final OrderService orderService = new OrderService();
    private final PaymentService paymentService = new PaymentService();
    private final StockService stockService = new StockService();

    String placeOrder(String product, int count, int price, String cardDetails) {
        boolean stockAvailable = stockService.isAvailable(product, count);
        String orderNum;
        if (stockAvailable) {
            orderNum = orderService.createOrder(product, price, count);
        } else {
            throw new RuntimeException("Stock Not available");
        }
        boolean success = paymentService.takePayment(cardDetails);
        if (success) {
            orderService.confirmOrder(orderNum);
            stockService.adjustStock(product, count);
        } else {
            throw new RuntimeException("Payment Failed");
        }
        return orderNum;
    }
}
