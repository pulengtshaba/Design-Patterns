package FactoryMethod;

public abstract class Restaurant {
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }
    // factory method
    public abstract Burger createBurger();
}
