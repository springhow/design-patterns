package com.springhow.designpatterns.decorator;

public class SportsCardDecorator extends SimpleCarDecorator {

    public SportsCardDecorator(SimpleCar car) {
        super(car);
    }

    @Override
    public String drive() {
        return super.drive() + " Faster...!";
    }

    public void tunePerformance(){
        System.out.println(" performance tuned..!");
    }
}
