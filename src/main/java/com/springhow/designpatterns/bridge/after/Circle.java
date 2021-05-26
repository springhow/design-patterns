package com.springhow.designpatterns.bridge.after;

public class Circle implements Shape {

    private final Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("This is a circle with color" + color.fill());
    }
}
