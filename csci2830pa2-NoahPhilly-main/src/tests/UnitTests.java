package tests;


import burger.Burger;
import burger.cheese.AmericanCheese;
import burger.cheese.PepperjackCheese;
import burger.garnish.FriedEgg;
import burger.garnish.OnionRings;
import burger.garnish.TomatoGarnish;
import burger.patty.BeefPatty;
import burger.patty.ImpossiblePatty;
import org.junit.jupiter.api.Test;
import pizza.Pizza;
import pizza.crust.PizzaCrust;
import pizza.crust.ThinCrust;
import pizza.sauce.PizzaSauce;
import pizza.sauce.TomatoSauce;
import pizza.topping.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTests {
    public double pizzaPrice = 0;
    public double ongoingTotal = 0;
    @Test
    public void checkPizzaPrice(){
        Pizza testPizza = new Pizza();
        testPizza.addTopping(new PepperoniTopping());
        testPizza.addTopping(new PepperTopping());
        assertEquals(testPizza.getPrice(), 1.10);
    }

    @Test
    public void checkPizzaTotal(){
        double sum = 0;

        Pizza testPizza = new Pizza();
        PizzaTopping topping1 = new PepperTopping();
        PizzaTopping topping2 = new PepperoniTopping();
        PizzaTopping topping3 = new AsiagoTopping();
        PizzaCrust crust = new ThinCrust();
        PizzaSauce sauce = new TomatoSauce();

        testPizza.addTopping(topping1);
        testPizza.addTopping(topping2);
        testPizza.addTopping(topping3);
        testPizza.setCrust(crust);
        testPizza.setSauce(sauce);

        sum += testPizza.getCrust().getPrice();
        sum += testPizza.getSauce().getPrice();

        for(int x = 0; x < testPizza.getTopping().size(); x++) {
            sum += testPizza.getTopping().get(x).getPrice();
        }
        assertEquals(testPizza.getPrice(), sum, .01);
    }

    @Test
    public void checkComposedPizza(){
        double sum = 0;

        Pizza testPizza = new Pizza();
        PizzaTopping topping1 = new PepperTopping();
        PizzaTopping topping2 = new PepperoniTopping();
        PizzaTopping topping3 = new AsiagoTopping();
        PizzaCrust crust = new ThinCrust();
        PizzaSauce sauce = new TomatoSauce();
        PizzaTopping topping4 = new MozzarellaTopping();


        testPizza.addTopping(topping1);
        testPizza.addTopping(topping2);
        testPizza.addTopping(topping3);
        testPizza.addTopping(topping4);
        testPizza.setCrust(crust);
        testPizza.setSauce(sauce);


        sum += testPizza.getCrust().getPrice();
        sum += testPizza.getSauce().getPrice();
        System.out.println(testPizza.display());
        for(int x = 0; x < testPizza.getTopping().size(); x++){
            sum += testPizza.getTopping().get(x).getPrice();
        }
        System.out.println(testPizza.getPrice());
        pizzaPrice = sum;
        ongoingTotal += pizzaPrice;
        assertEquals(testPizza.getPrice(), sum, .01);
    }

    @Test
    public void checkTotalBurgerPrice(){
        double sum = 0;
        Burger testBurg = new Burger();
        testBurg.addComponent(new ImpossiblePatty());
        testBurg.addComponent(new BeefPatty());
        testBurg.addComponent(new OnionRings());
        testBurg.addComponent(new TomatoGarnish());
        testBurg.addComponent(new FriedEgg());
        testBurg.addComponent(new AmericanCheese());
        testBurg.addComponent(new PepperjackCheese());

        for(int x = 0; x < testBurg.getComponents().size(); x++){
            sum += testBurg.getComponents().get(x).getPrice();
        }
        System.out.println(testBurg.getPrice() + pizzaPrice);
        ongoingTotal += testBurg.getPrice() + pizzaPrice;
        assertEquals(testBurg.getPrice() + pizzaPrice, sum + pizzaPrice, .01);
    }

    @Test
    public void checkTotalAfterTwoPizzas(){
        double sum = 0;
        Pizza testPizza = new Pizza();
        Pizza testPizza2 = new Pizza();

        PizzaTopping topping1 = new PepperTopping();
        PizzaTopping topping2 = new PepperoniTopping();
        PizzaTopping topping3 = new AsiagoTopping();
        PizzaTopping topping4 = new MozzarellaTopping();

        PizzaCrust crust = new ThinCrust();
        PizzaSauce sauce = new TomatoSauce();

        testPizza.addTopping(topping1);
        testPizza.addTopping(topping2);
        testPizza.addTopping(topping3);
        testPizza.addTopping(topping4);
        testPizza.setCrust(crust);
        testPizza.setSauce(sauce);

        testPizza2.addTopping(topping1);
        testPizza2.addTopping(topping2);
        testPizza2.addTopping(topping3);
        testPizza2.addTopping(topping4);
        testPizza2.setCrust(crust);
        testPizza2.setSauce(sauce);


        sum += testPizza.getCrust().getPrice();
        sum += testPizza.getSauce().getPrice();

        sum += testPizza2.getCrust().getPrice();
        sum += testPizza2.getSauce().getPrice();
        for(int x = 0; x < testPizza.getTopping().size(); x++){
            sum += testPizza.getTopping().get(x).getPrice();
            sum += testPizza2.getTopping().get(x).getPrice();
        }
        System.out.println(testPizza.getPrice());


        assertEquals(testPizza2.getPrice() + testPizza.getPrice() + ongoingTotal,
                ongoingTotal + sum,.01);
    }


}
