package org.example.DecoratorPattern;

public class PizzaStore {

    public static void main(String[] args) {

        // Margherita + Extra cheese
       BasePizza pizza1 = new ExtraCheeseTopping(new MargheritaPizza());
       System.out.println(pizza1.cost());


        // Margherita + Extra cheese + Extra Mushroom
        BasePizza pizza2 = new ExtraMushroomTopping(new ExtraCheeseTopping(new MargheritaPizza()));
        System.out.println(pizza2.cost());
    }
}
