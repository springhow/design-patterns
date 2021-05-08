package com.springhow.designpatterns.singleton;

public final class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello From Singleton");
    }
}
