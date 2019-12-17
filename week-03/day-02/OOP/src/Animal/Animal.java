package Animal;

public class Animal {

    private String animalName;
    private Integer hunger;
    private Integer thirst;


    public Animal(String animalName){
        this.animalName = animalName;
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat(){
        this.hunger--;
    }

    public void drink(){
        this.thirst--;
    }

    public void play(){
        this.hunger++;
        this.thirst++;
    }

    public void print(){
        System.out.println(animalName + " hunger: " + hunger + ", thirst: " + thirst);
    }

}
