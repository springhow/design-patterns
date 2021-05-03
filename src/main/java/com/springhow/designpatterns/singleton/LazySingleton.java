package com.springhow.designpatterns.singleton;

public final class LazySingleton {
    private static LazySingleton INSTANCE;
    private LazySingleton() {
    }
    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
