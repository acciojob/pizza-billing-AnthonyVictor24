package com.driver;

import java.util.Scanner;

public class Pizza {

//    private int price;
//    private Boolean isVeg;
//    private String bill;
//    private int countCheese = 0;
//    private int countToppings = 0;
//    int vegPrice = 0;
//    int Non_vegPrice = 0;
//
//
//    Scanner sc = new Scanner(System.in);
//    boolean addExtraCheese = true;
//    boolean addExtraTopping = true;
//    boolean isTakeaway = true;
//
//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//        // your code goes here
//        if(isVeg==true){
//            this.price = 300;
//            vegPrice = this.price;
//        }else if(isVeg == false){
//            this.price = 400;
//            Non_vegPrice = this.price;
//        }
//        mainMenu();
//    }
//
//    public void mainMenu(){
//        System.out.println("1.Do you want extra Cheese");
//        System.out.println("2.Do you want extra Toppings");
//        System.out.println("3.Do you want TakeWay");
//        System.out.println("4.To repeat the menu");
//        System.out.println("5.Exist");
//        System.out.print("Enter the options you want:");
//
//        int choice = sc.nextInt();
//        if(choice==1){
//            addExtraCheese();
//        }else if(choice == 2){
//            addExtraToppings();
//        } else if(choice == 3){
//            addTakeaway();
//        }else if(choice == 4){
//            mainMenu();
//        }else if(choice == 5){
//            return;
//        }
//    }
//
//    public int getPrice(){
//
//        return this.price;
//    }
//
//    public void addExtraCheese(){
//        // your code goes here
//
//        if(this.countCheese==0){
//            this.price+=80;
//            countCheese++;
//        }
//        addExtraCheese = false;
//        mainMenu();
//    }
//
//    public void addExtraToppings(){
//        // your code goes here
//
//        if(countToppings==0){
//            if(isVeg == true){
//                this.price +=70;
//
//            }else if(isVeg == false){
//                this.price +=120;
//            }
//            countToppings++;
//        }
//
//        addExtraTopping = false;
//        mainMenu();
//    }
//
//    public void addTakeaway(){
//        // your code goes here
//
//        this.price +=20;
//        isTakeaway = false;
//        mainMenu();
//    }
//
//    public String getBill(){
//        // your code goes here
//        StringBuilder sb = new StringBuilder();
//        if(isVeg){
//            sb.append("Base Price Of The Pizza: ").append(vegPrice).append("\n");
//        }else{
//            sb.append("Base Price Of The Pizza: ").append(Non_vegPrice).append("\n");
//
//        }
//
//        if(!addExtraCheese){
//            sb.append("Extra Cheese Added: 80\n");
//        }
//
//        if(isVeg && !addExtraTopping){
//            sb.append("Extra Toppings Added: 70\n");
//        }else if(!isVeg && !addExtraTopping){
//            sb.append("Extra Toppings Added: 120\n");
//        }
//
//        if(!isTakeaway){
//            sb.append("Extra Toppings Added: 20\n");
//        }
//
//        sb.append("Total Price: ").append(price);
//
//        return sb.toString();
//    }


//---------------------------------According to accio--------------------------------//
//*********************************Accio***********************************************


    private int price;
    private Boolean isVeg;
    private String bill;
    int totalPrice;
    boolean isAddExtraCheese;
    boolean isAddExtraTopping;
    boolean isTakeaway;
//    boolean isDeluxe = true;


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


