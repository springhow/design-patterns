package com.springhow.designpatterns.bridge.after;

public class Square implements Shape {

    private final Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("This is a square with color" + color.fill());
    }
}
