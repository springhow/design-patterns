package com.springhow.designpatterns.abstract_factory.mac;

public class RoundedMacButton extends MacButton {
    @Override
    public void onClick() {
        System.out.println("You clicked a 'Rounded' Mac OS Button");
    }
}
