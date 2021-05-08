package com.springhow.designpatterns.builder;

public class Pizza {

    private final Size size;
    private final Crust crust;
    private final Sauce sauce;
    private final boolean extraCheese;
    private final boolean jalapeno;
    private final boolean pepper;
    private final boolean corn;
    private final boolean tomato;
    private final boolean peperoni;
    private final boolean pineapple;
    private final boolean seasoning;

    public Pizza(Size size, Crust crust, Sauce sauce, boolean extraCheese, boolean jalapeno, boolean pepper, boolean corn, boolean tomato, boolean peperoni, boolean pineapple, boolean seasoning) {

        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.extraCheese = extraCheese;
        this.jalapeno = jalapeno;
        this.pepper = pepper;
        this.corn = corn;
        this.tomato = tomato;
        this.peperoni = peperoni;
        this.pineapple = pineapple;
        this.seasoning = seasoning;
    }

    public Size getSize() {
        return size;
    }

    public Crust getCrust() {
        return crust;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isJalapeno() {
        return jalapeno;
    }

    public boolean isPepper() {
        return pepper;
    }

    public boolean isCorn() {
        return corn;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isPeperoni() {
        return peperoni;
    }

    public boolean isPineapple() {
        return pineapple;
    }

    public boolean isSeasoning() {
        return seasoning;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", crust=" + crust +
                ", sauce=" + sauce +
                (extraCheese ? ", extraCheese=" + true : "") +
                (jalapeno ? ", jalapeno=" + true : "") +
                (pepper ? ", pepper=" + true : "") +
                (corn ? ", corn=" + true : "") +
                (tomato ? ", tomato=" + true : "") +
                (peperoni ? ", peperoni=" + true : "") +
                (pineapple ? ", pineapple=" + true : "") +
                (seasoning ? ", seasoning=" + true : "") +
                '}';
    }
}
