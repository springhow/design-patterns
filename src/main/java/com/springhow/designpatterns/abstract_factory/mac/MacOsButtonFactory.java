package com.springhow.designpatterns.abstract_factory.mac;

import com.springhow.designpatterns.abstract_factory.ButtonFactory;

public class MacOsButtonFactory extends ButtonFactory {
    @Override
    public MacButton createButton(boolean rounded) {
        if (rounded) {
            return new RoundedMacButton();
        } else {
            return new MacButton();
        }
    }
}
