package com.orsi.foxclub.models;

import java.util.ArrayList;

public class Fox {

    private String foxName;
    private String food;
    private String drink;
    ArrayList<String> tricks;

    public Fox(String foxName) {
        this.foxName = foxName;
        this.food = "pizza";
        this.drink = "coke";
        this.tricks = new ArrayList<>();
    }

    public String getFoxName() {
        return foxName;
    }

    public void setFoxName(String foxName) {
        this.foxName = foxName;
    }

    public String getFood() {
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
    }

    public ArrayList<String> getTricks() {
        return tricks;
    }

    public void setTricks(ArrayList<String> tricks) {
        this.tricks = tricks;
    }
}
