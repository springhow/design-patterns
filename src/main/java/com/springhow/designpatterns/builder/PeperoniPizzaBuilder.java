package com.springhow.designpatterns.builder;

public class PeperoniPizzaBuilder implements PizzaBuilder {

    private Crust crust = Crust.CHEESE_FILLED;
    private Sauce sauce = Sauce.MEXICAN;
    private Size size = Size.REGULAR;

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
        return new Pizza(size, crust, sauce, true, false, true, false, false, true, false, true);
    }

}
