package Garden;

public class Plant {

    String color;
    double amountOfWater;

    public Plant(String color, Integer amountOfWater){
        this.color = color;
        this.amountOfWater = amountOfWater;
    }

    public void irrigation(Double irrigation){
        amountOfWater++;
    }
}
