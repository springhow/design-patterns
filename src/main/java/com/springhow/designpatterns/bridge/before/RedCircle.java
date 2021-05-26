package com.springhow.designpatterns.bridge.before;

public class RedCircle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a red Circle");
    }
}
