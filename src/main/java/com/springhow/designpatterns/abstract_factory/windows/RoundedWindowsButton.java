package com.springhow.designpatterns.abstract_factory.windows;

public class RoundedWindowsButton extends WindowsButton {
    @Override
    public void onClick() {
        System.out.println("You clicked a 'Rounded' Windows Button");
    }
}
