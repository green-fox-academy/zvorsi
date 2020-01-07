package Garden;

public class Flower extends Plant{

    public Flower(String color, Integer amountOfWater){
       super(color, amountOfWater);
    }

    @Override
    public void irrigation(Double irrigation){
        if (amountOfWater <= 5){
            this.amountOfWater = irrigation * 0.75;
        }
    }
}
