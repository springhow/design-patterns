package com.springhow.designpatterns.abstract_factory.windows;

import com.springhow.designpatterns.abstract_factory.Button;

public class WindowsButton implements Button {
    @Override
    public void onClick() {
        System.out.println("You clicked a windows Button");
    }
}
