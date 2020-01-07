package Garden;

public class Tree extends Plant{

    public Tree (String color, Integer amountOfWater){
        super(color, amountOfWater);
    }

    @Override
    public void irrigation(Double irrigation){
        if (amountOfWater <= 10){
            this.amountOfWater = irrigation * 0.4;
        }
    }

}
