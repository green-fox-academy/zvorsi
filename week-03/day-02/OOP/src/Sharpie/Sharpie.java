package Sharpie;

public class Sharpie {

    private String color;
    private Float width;
    private Float inkAmount;

    public Sharpie(String color, Float width){
        this.color = color;
        this.width = width;
        this.inkAmount = 100f;
    }

    public void use(){
        this.inkAmount--;
    }

    public void print(){
        System.out.println("remaining ink amount: " + inkAmount + " of " + color + " " + width + " sharpie");
    }



}
