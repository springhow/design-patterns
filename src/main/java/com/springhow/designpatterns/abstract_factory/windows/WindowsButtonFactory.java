package com.springhow.designpatterns.abstract_factory.windows;

import com.springhow.designpatterns.abstract_factory.ButtonFactory;

public class WindowsButtonFactory extends ButtonFactory {
    @Override
    public WindowsButton createButton(boolean rounded) {
        if(rounded){
            return new RoundedWindowsButton();
        } else {
            return new WindowsButton();
        }
    }
}
