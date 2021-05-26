package com.springhow.designpatterns.bridge.before;

public class GreenSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a green Square");
    }
}
