package com.springhow.designpatterns.bridge.before;

public class GreenCircle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a green Circle");
    }
}
