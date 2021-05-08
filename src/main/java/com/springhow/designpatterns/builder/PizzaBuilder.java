package com.springhow.designpatterns.builder;

public interface PizzaBuilder {
    PizzaBuilder withCrust(Crust crust);

    PizzaBuilder withSauce(Sauce sauce);

    PizzaBuilder ofSize(Size size);

    Pizza build();
}
