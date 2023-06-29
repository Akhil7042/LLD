package org.example.DecoratorPattern;

// Base pizza 1
public class FarmhousePizza extends  BasePizza{
    @Override
    public int cost() {
        return 200;
    }
}
