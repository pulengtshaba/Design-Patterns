package FactoryMethod;

public class Factory {
    public static void main(String[] args){
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        Burger beefBurger = beefRestaurant.orderBurger();

        Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
        Burger veggiBurger = veggieRestaurant.orderBurger();
    }
}
