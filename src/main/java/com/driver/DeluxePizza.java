package com.driver;

public class DeluxePizza extends Pizza {

//    public DeluxePizza(Boolean isVeg) {
//        super(isVeg);
//        // your code goes here
//
//    }


    public DeluxePizza(int price,Boolean isVeg) {
        super(price,isVeg);
        // your code goes here
        this.addExtraCheese = false;
        this.addExtraTopping = false;
        this.totalPrice+=200;
    }
}


