package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    dp.bill();
//    System.out.println(dp.getPrice());
//
//    dp.addTakeaway();
//    dp.addExtraCheese();
//    dp.addTakeaway();
//    System.out.println(dp.getBill());

    System.out.println();
    System.out.println();
    Pizza p = new Pizza(false);
//    p.addExtraCheese();
//    p.addExtraToppings();
//    p.addTakeaway();
//    System.out.println(p.getBill());
    p.bill();
  }
}