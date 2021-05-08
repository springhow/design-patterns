package com.springhow.designpatterns.builder;

public class BuilderPatternTest {
    public static void main(String[] args) {
        //this main class acts as the pizza director
        Pizza regularPanMargarita = new MargaritaPizzaBuilder()
                .withCrust(Crust.PAN)
                .ofSize(Size.REGULAR)
                .withSauce(Sauce.TOMATO)
                .build();
        Pizza peperoniLarge = new PeperoniPizzaBuilder().build();
        Pizza pineapplePizza = new PineapplePizzaBuilder().withSauce(Sauce.PESTO).build();
        System.out.println(regularPanMargarita);
        System.out.println(peperoniLarge);
        System.out.println(pineapplePizza);

    }
}
