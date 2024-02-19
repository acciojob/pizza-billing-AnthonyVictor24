package com.driver;

import java.util.Scanner;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    int totalPrice;
    boolean isAddExtraCheese;
    boolean isAddExtraTopping;
    boolean isTakeaway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true){
            this.price = 300;
        }else if(isVeg == false) {
            this.price = 400;
        }
        this.totalPrice = price;
        isAddExtraCheese = false;
        isAddExtraTopping = false;
        isTakeaway=false;

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){

        if(isAddExtraCheese == false){
            totalPrice+=80;
            isAddExtraCheese=true;
        }
    }

    public void addExtraToppings(){
        if(isAddExtraTopping==false && isVeg==true){
            this.totalPrice+=70;
        }else if(isAddExtraTopping==false && isVeg==false){
            this.totalPrice+=120;
        }
        isAddExtraTopping=true;

    }

    public void addTakeaway(){
        if(isTakeaway == false){
            this.totalPrice+=20;
            isTakeaway=true;
        }
    }

    public String getBill(){
        // your code goes here
        StringBuilder sb = new StringBuilder();
        if(isVeg){
            sb.append("Base Price Of The Pizza: ").append(price).append("\n");
        }else{
            sb.append("Base Price Of The Pizza: ").append(price).append("\n");

        }

        if(isAddExtraCheese == true ){
            sb.append("Extra Cheese Added: 80\n");
        }

        if(isVeg && isAddExtraTopping == true ){
            sb.append("Extra Toppings Added: 70\n");
        }else if(!isVeg && isAddExtraTopping ==true ){
            sb.append("Extra Toppings Added: 120\n");
        }

        if(isTakeaway ==true){
            sb.append("Paperbag Added: 20\n");
        }

        sb.append("Total Price: ").append(totalPrice).append("\n");

        return sb.toString();
    }
}



