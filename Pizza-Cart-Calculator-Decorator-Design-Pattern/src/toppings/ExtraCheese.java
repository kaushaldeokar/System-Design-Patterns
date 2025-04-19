package toppings;

import pizza.Pizza;

public class ExtraCheese implements Topping{

    public Pizza pizza;
    public double extraCheeseCost;

    public ExtraCheese(Pizza pizza){
        this.pizza=pizza;
        this.extraCheeseCost = 50.0;
    }

    @Override
    public double cost() {
        return pizza.cost() + extraCheeseCost;
    }
}
