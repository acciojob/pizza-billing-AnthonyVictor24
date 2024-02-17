package com.driver;

import java.util.Scanner;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int countCheese = 0;
    int countToppings = 0;


    Scanner sc = new Scanner(System.in);
    int vegPrice = 0;
    int Non_vegPrice = 0;
    boolean addExtraCheese = true;
    boolean addExtraTopping = true;
    boolean isTakeaway = true;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            this.price = 300;
            vegPrice = this.price;
        }else if(isVeg == false){
            this.price = 400;
            Non_vegPrice = this.price;
        }
        mainMenu();
    }

    public void mainMenu(){
        System.out.println("1.Do you want extra Cheese");
        System.out.println("2.Do you want extra Toppings");
        System.out.println("3.Do you want TakeWay");
        System.out.println("4.To repeat the menu");
        System.out.println("5.Exist");
        System.out.print("Enter the options you want:");

        int choice = sc.nextInt();
        if(choice==1){
            addExtraCheese();
        }else if(choice == 2){
            addExtraToppings();
        } else if(choice == 3){
            addTakeaway();
        }else if(choice == 4){
            mainMenu();
        }else if(choice == 5){
            return;
        }
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(this.countCheese==0){
            this.price+=80;
            addExtraCheese = false;
            countCheese++;
        }

        mainMenu();
    }

    public void addExtraToppings(){
        // your code goes here

        if(countToppings==0){
            if(isVeg == true){
                this.price +=70;

            }else if(isVeg == false){
                this.price +=120;
            }
            countToppings++;
        }

        addExtraTopping = false;
        mainMenu();
    }

    public void addTakeaway(){
        // your code goes here

        this.price +=20;
        isTakeaway = false;
        mainMenu();
    }

//    public String getBill(){
//        // your code goes here
////        System.out.println("Base Price Of The Pizza: "+vegPrice);
////       if(!addExtraCheese){
////           System.out.println("Extra Cheese Added: 80");
////       }
////       if(isVeg && !addExtraTopping){
////           System.out.println("Extra Toppings Added: 70");
////       }else if(!isVeg && !addExtraTopping){
////           System.out.println("Extra Toppings Added: 120");
////       }
////       if(!isTakeaway){
////           System.out.println("Paperbag Added: 20");
////       }
////        System.out.println("Total Price: "+price);
//        return this.bill;
//    }

    public void bill(){
        if(isVeg){
            System.out.println("Base Price Of The Pizza: "+vegPrice);
        }else{
            System.out.println("Base Price Of The Pizza: "+Non_vegPrice);
        }

        if(!addExtraCheese){
            System.out.println("Extra Cheese Added: 80");
        }
        if(isVeg && !addExtraTopping){
            System.out.println("Extra Toppings Added: 70");
        }else if(!isVeg && !addExtraTopping){
            System.out.println("Extra Toppings Added: 120");
        }
        if(!isTakeaway){
            System.out.println("Paperbag Added: 20");
        }
        System.out.println("Total Price: "+price);
    }

}


