package com.orsi.foxclub.models;

import java.util.ArrayList;

public class Fox {

    private String foxName;
    private FoxFood foxFood;
    private FoxDrink foxDrink;
    ArrayList<FoxTrick> tricks;

    public Fox(String foxName) {
        this.foxName = foxName;
        this.foxFood = FoxFood.SALAD;
        this.foxDrink = FoxDrink.WATER;
        this.tricks = new ArrayList<FoxTrick>();
    }

    public String getFoxName() {
        return foxName;
    }

    public void setFoxName(String foxName) {
        this.foxName = foxName;
    }


    public void setFoxFood(FoxFood foxFood) {
        this.foxFood = foxFood;
    }

    public FoxDrink getFoxDrink() {
        return foxDrink;
    }

    public void setFoxDrink(FoxDrink foxDrink) {
        this.foxDrink = foxDrink;
    }

    public ArrayList<FoxTrick> getTricks() {
        return tricks;
    }

    public void setTricks(ArrayList<FoxTrick> tricks) {
        this.tricks = tricks;
    }

    public FoxFood getFoxFood() {
        return foxFood;
    }

    /* public String getFood() {
         return food;
     }

     public void setFood(String food) {
         this.food = food;
     }

     public String getDrink() {
         return drink;
     }

     public void setDrink(String drink) {
         this.drink = drink;
     }*/
}
