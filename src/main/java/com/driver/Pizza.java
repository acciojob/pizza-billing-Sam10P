package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean extraCheese = false;
    private Boolean extraToppings = false;
    private Boolean paperBag = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg == true){
            this.price += 300;
        }else{
            this.price += 400;
        }

    }

    public int getPrice(){

        return this.price;

    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese == true){
            return;
        }
        price = getPrice() + 80;
        extraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppings == true){
            return;
        }
        if(isVeg == true){
            price = getPrice() + 70;
        }else{
            price = getPrice() + 120;
        }
        extraToppings = true;


    }

    public void addTakeaway(){
        // your code goes here
        if(paperBag == true){
            return;
        }
        price = getPrice() + 20;
        paperBag = true;
    }

    public String getBill(){
        // your code goes here
        if(isVeg == true){
            bill = "Base Price Of The Pizza: 300\n";
        }else{
            bill = "Base Price Of The Pizza: 400\n";
        }

        if(extraCheese == true){
            bill = bill + "Extra Cheese Added: 80\n";
        }

        if(extraToppings == true){
            if(isVeg == true){
                bill = bill + "Extra Toppings Added: 70\n";
            }else{
                bill = bill + "Extra Toppings Added: 120\n";
            }
        }

        if(paperBag == true){
            bill = bill + "Paperbag Added: 20\n";
        }

        String totalPrice = Integer.toString(getPrice());

        bill = bill + "Total Price: " + totalPrice;
        return this.bill;
    }
}
