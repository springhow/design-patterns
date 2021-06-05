package com.springhow.designpatterns.decorator;

public class SimpleCar implements Car {
    @Override
    public String drive() {
        return "Drive!";
    }
}
