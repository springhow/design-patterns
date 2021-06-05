package com.springhow.designpatterns.decorator;

public abstract class SimpleCarDecorator implements Car {

    protected Car car;

    public SimpleCarDecorator(SimpleCar car) {
        this.car = car;
    }

    public String drive() {
        return car.drive();
    }

}
