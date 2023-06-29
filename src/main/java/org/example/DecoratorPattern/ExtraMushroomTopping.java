package org.example.DecoratorPattern;

//Decorator 2
public class ExtraMushroomTopping extends ToppingsDecorator{

    public ExtraMushroomTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
