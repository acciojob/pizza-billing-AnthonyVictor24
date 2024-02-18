package com.driver;

public class Main {
  public static void main(String[] args) {
//    DeluxePizza dp = new DeluxePizza(true);
//    dp.bill();
//    System.out.println(dp.getPrice());
////
////    dp.addTakeaway();
////    dp.addExtraCheese();
////    dp.addTakeaway();
//    System.out.println(dp.getBill());
//
//    System.out.println();
//    System.out.println();
//    Pizza p = new Pizza(false);
////    p.addExtraCheese();
////    p.addExtraToppings();
////    p.addTakeaway();
//    System.out.println(p.getBill());
////    p.bill();
//
//    DeluxePizza dp1 = new DeluxePizza(false);
//    System.out.println(dp1.getBill());






    DeluxePizza dp = new DeluxePizza(true);
    dp.addExtraCheese();
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addExtraToppings();
    dp.addExtraCheese();
    dp.addExtraToppings();

    System.out.println(dp.getBill());

    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addExtraCheese();
    p.addExtraCheese();
    System.out.println(p.getBill());

    DeluxePizza dp2 = new DeluxePizza(false);
    dp2.addExtraCheese();
    dp2.addExtraToppings();
    System.out.println(dp2.getBill());
  }
}

