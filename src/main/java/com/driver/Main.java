package com.driver;

public class Main {
  public static void main(String[] args) {
    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    System.out.println(p.getBill());

    Pizza p2 = new Pizza(false);
    p2.addExtraCheese();
    p2.addExtraToppings();
    System.out.println(p2.getBill());

    DeluxePizza dp = new DeluxePizza(true);
    dp.addTakeaway();
    System.out.println(dp.getBill());

    DeluxePizza dp2 = new DeluxePizza(false);
    dp2.addTakeaway();
    System.out.println(dp2.getBill());




  }
}

