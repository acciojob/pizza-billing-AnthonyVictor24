package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    dp.addExtraCheese();
//    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addExtraToppings();
    dp.addExtraCheese();
    dp.addExtraToppings();

    System.out.println(dp.getBill());

    Pizza p = new Pizza(false);
    p.addExtraToppings();
    p.addExtraCheese();
    p.addExtraCheese();
    p.addExtraCheese();
    System.out.println(p.getBill());

    DeluxePizza dp2 = new DeluxePizza(false);
    dp2.addExtraCheese();
//    dp2.addExtraToppings();
    dp2.addTakeaway();
    System.out.println(dp2.getBill());

    Pizza p2 = new Pizza(true);
//    p2.addExtraCheese();
    p2.addExtraToppings();
    p2.addTakeaway();
    System.out.println(p2.getBill());

    Pizza p3 = new Pizza(true);
//    p2.addExtraCheese();
    p3.addExtraToppings();
   p3.addExtraCheese();
    System.out.println(p3.getBill());

  }
}

