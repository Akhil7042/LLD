package org.example.DecoratorPattern;

//Decorator 1
public class ExtraCheeseTopping extends ToppingsDecorator{

    public ExtraCheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
