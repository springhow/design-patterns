package com.springhow.designpatterns.composite;

public class Expression implements Evaluable {

    private Evaluable leftOperand;
    private Evaluable rightOperand;
    private final Operation operation;

    public Expression(Evaluable leftOperand, Evaluable rightOperand, Operation operation) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operation = operation;
    }


    @Override
    public int evaluate() {
        Integer result = null;

        switch (operation) {
            case ADD:
                result = leftOperand.evaluate() + rightOperand.evaluate();
                break;
            case SUB:
                result = leftOperand.evaluate() - rightOperand.evaluate();
                break;
            case MUL:
                result = leftOperand.evaluate() * rightOperand.evaluate();
                break;
            case DIV:
                result = leftOperand.evaluate() / rightOperand.evaluate();
                break;
        }
        return result;
    }
}
