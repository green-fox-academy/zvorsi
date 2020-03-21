package AnimalProtection;

import java.util.ArrayList;

public class AnimalShelter {

    protected int budget = 50;
    protected ArrayList<String> animals;
    protected ArrayList<String> adopters;
    protected String adopterName;
    protected int amount;

    public int rescue(String Animal){
        animals.add(Animal);
        return animals.size();
    }

    public void heal(){
        //heals the first not healthy Animal
        //if it is possible by budget, returns the amount of healed animals(0 or 1)
    }

    public void addAdopter(String adopterName){
        adopters.add(adopterName);
    }

    public void findNewOwner(){
        //this method pairs a random name with a random adoptable Animal if it is possible
        //and removes both of them from the lists
    }

    public void earnDonation(int amount){
        budget++;
    }

    public String toString(){


        //System.out.println("Budget: " + "€");
        return "Budget: " + "€," +
                "There are " + animals.size() + " animal(s) and " + adopters.size() + " potential adopter(s) ";
        //Budget: <budget>€,
        //There are <animals.count> animal(s) and <potentionalAdopters.count> potential adopter(s)
        //<name> is not healthy (healing would cost: <heal cost> €) and not adoptable ???
        //<name> is healthy and adoptable ???
    }

    public static void main(String[] args) {

    }
}
