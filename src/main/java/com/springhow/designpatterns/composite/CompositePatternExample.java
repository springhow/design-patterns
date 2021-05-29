package com.springhow.designpatterns.composite;

public class CompositePatternExample {
    public static void main(String[] args) {
        //A sample expression for (10 + 2) / 6

        Evaluable evaluable = new Operand(5);
        System.out.println("Result :" + evaluable.evaluate());

        Evaluable expression1 = new Expression(new Operand(3),new Operand(5),Operation.MUL);
        System.out.println("Result :" + expression1.evaluate());

        Expression expression
                = new Expression(
                        new Expression(
                                new Operand(10),
                                new Operand(2),
                                Operation.ADD
                        ),
                        new Operand(6),
                        Operation.DIV
                    );
        int evaluate = expression.evaluate();
        System.out.println("Result :" + evaluate);




    }
}
