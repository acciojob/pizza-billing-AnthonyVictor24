package com.driver;

import java.util.Scanner;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    boolean isAddExtraCheese;
    boolean isAddExtraTopping;
    boolean isTakeaway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
        }else if(!isVeg) {
            this.price = 400;
        }
        isAddExtraCheese = false;
        isAddExtraTopping = false;
        isTakeaway=false;

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){

        if(!isAddExtraCheese){
            price+=80;
            isAddExtraCheese=true;
        }
    }

    public void addExtraToppings(){
        if(!isAddExtraTopping && isVeg){
            price+=70;
        }else if(!isAddExtraTopping && !isVeg){
            price+=120;
        }
        isAddExtraTopping=true;

    }

    public void addTakeaway(){
        if(!isTakeaway){
            price+=20;
            isTakeaway=true;
        }
    }

    public String getBill(){
        // your code goes here
        StringBuilder sb = new StringBuilder();
        if(isVeg){
            sb.append("Base Price Of The Pizza: ").append(300).append("\n");
        }else{
            sb.append("Base Price Of The Pizza: ").append(400).append("\n");

        }

        if(isAddExtraCheese){
            sb.append("Extra Cheese Added: 80\n");
        }

        if(isVeg && isAddExtraTopping ){
            sb.append("Extra Toppings Added: 70\n");
        }else if(!isVeg && isAddExtraTopping ){
            sb.append("Extra Toppings Added: 120\n");
        }

        if(isTakeaway){
            sb.append("Paperbag Added: 20\n");
        }

        sb.append("Total Price: ").append(price).append("\n");

        return sb.toString();
    }
}



