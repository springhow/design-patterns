package com.springhow.designpatterns.abstract_factory;

import com.springhow.designpatterns.abstract_factory.mac.MacOsButtonFactory;
import com.springhow.designpatterns.abstract_factory.windows.WindowsButtonFactory;

public class ButtonFactoryProvider {

    public static ButtonFactory getFactory(String osName) {
        if (osName.equals("windows")) {
            return new WindowsButtonFactory();
        } else if (osName.equals("mac")) {
            return new MacOsButtonFactory();
        } else {
            throw new RuntimeException("Not implemented yet");
        }
    }
}
