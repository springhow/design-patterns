package com.springhow.designpatterns.composite;

public class Operand implements Evaluable {

    private int value;

    public Operand(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
