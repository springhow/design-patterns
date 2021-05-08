package com.springhow.designpatterns.builder;

public class PineapplePizzaBuilder implements PizzaBuilder {

    private Crust crust = Crust.SICILIAN;
    private Sauce sauce = Sauce.WHITE_GARLIC;
    private Size size = Size.MEDIUM;

    @Override
    public PizzaBuilder withCrust(Crust crust) {
        this.crust = crust;
        return this;
    }

    @Override
    public PizzaBuilder withSauce(Sauce sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder ofSize(Size size) {
        this.size = size;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(size, crust, sauce, false, true, false, false, true, false, true, true);
    }

}
