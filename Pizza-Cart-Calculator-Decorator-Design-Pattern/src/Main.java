import pizza.MargrettaPizza;
import pizza.Pizza;
import toppings.ExtraCheese;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new ExtraCheese(new MargrettaPizza());

        System.out.println(pizza.cost());
    }
}