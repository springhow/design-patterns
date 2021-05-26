package com.springhow.designpatterns.bridge;

import com.springhow.designpatterns.bridge.after.*;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        redCircle.draw();
        Shape redSquare = new Square(new Red());
        redSquare.draw();
        Shape greenCircle = new Circle(new Green());
        greenCircle.draw();
        Shape greenSquare = new Square(new Green());
        greenSquare.draw();
    }
}
