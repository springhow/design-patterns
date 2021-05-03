package com.springhow.designpatterns.abstract_factory;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        ButtonFactory buttonFactory = ButtonFactoryProvider.getFactory("windows");
        Button button = buttonFactory.createButton(false);
        button.onClick();
        button = buttonFactory.createButton(true);
        button.onClick();
        buttonFactory = ButtonFactoryProvider.getFactory("mac");
        button = buttonFactory.createButton(false);
        button.onClick();
        button = buttonFactory.createButton(true);
        button.onClick();
    }
}
