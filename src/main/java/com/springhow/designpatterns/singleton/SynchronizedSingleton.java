package com.springhow.designpatterns.singleton;

public final class SynchronizedSingleton {
    private static SynchronizedSingleton INSTANCE;
    private SynchronizedSingleton() {
    }
    public static SynchronizedSingleton getInstance() {
        synchronized(SynchronizedSingleton.class){
            if (INSTANCE == null) {
                INSTANCE = new SynchronizedSingleton();
            }
        }
        return INSTANCE;
    }
}
