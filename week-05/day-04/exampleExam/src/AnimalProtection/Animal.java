package AnimalProtection;

import java.util.Random;

public abstract class Animal {

    protected String name;
    protected String ownerName;
    protected boolean isHealthy;
    protected Random random = new Random();
    protected int healCost = random.nextInt();

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public int getHealCost() {
        return healCost;
    }

    public void setHealCost(int healCost) {
        this.healCost = healCost;
    }

    public Animal(String name) {
        this.name = name;
        this.healCost = healCost();
    }

    public abstract int healCost();

    public void heal(){
        isHealthy = true;
    }

    public boolean isAdoptable(){
        return !(isHealthy);
    }

    public String toString(boolean isAdoptable){
        return this.getClass().getName() + " is healthy andadoptable";
    }
}
