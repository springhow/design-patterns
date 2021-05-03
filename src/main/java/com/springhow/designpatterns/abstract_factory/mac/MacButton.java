package com.springhow.designpatterns.abstract_factory.mac;

import com.springhow.designpatterns.abstract_factory.Button;

public class MacButton implements Button {
    @Override
    public void onClick() {
        System.out.println("You clicked a Mac OS Button");
    }
}
