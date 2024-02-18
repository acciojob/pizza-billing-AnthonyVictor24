package com.driver;

public class DeluxePizza extends Pizza {

//    public DeluxePizza(Boolean isVeg) {
//        super(isVeg);
//        // your code goes here
//
//    }


    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        this.addExtraCheese = false;
        this.addExtraTopping = false;
        if(isVeg == true){
            this.totalPrice +=70;
        }else{
            this.totalPrice +=120;
        }
        this.totalPrice +=80;
        // your code goes here
//        this.addExtraCheese = false;
//        this.addExtraTopping = false;
//        this.totalPrice+=200;
//        System.out.println("haii");
//        System.out.println(totalPrice);
//        System.out.println("hello");
    }
}


