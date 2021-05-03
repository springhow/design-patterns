package com.springhow.designpatterns.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();

        //Create Apple object using factory and call produceJuice method
        Fruit fruit = factory.getFruit("apple");
        fruit.produceJuice();
        //Create Orange object using factory and call produceJuice method
        fruit = factory.getFruit("orange");
        fruit.produceJuice();
        //Create Banana object using factory and call produceJuice method
        fruit = factory.getFruit("banana");
        fruit.produceJuice();
    }

}
