package com.driver;

public class DeluxePizza extends Pizza {

//    public DeluxePizza(Boolean isVeg) {
//        super(isVeg);
//        // your code goes here
//
//    }


    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        this.addExtraCheese = false;
        this.addExtraTopping = false;
        this.totalPrice+=200;
//        System.out.println("haii");
//        System.out.println(totalPrice);
//        System.out.println("hello");
    }
}


