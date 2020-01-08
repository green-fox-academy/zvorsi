package Flyable;

public class Helicopter extends Vehicle implements Flyable{

    public Helicopter(String vehicleName){
        super(vehicleName);
    }

    @Override
    public void land() {
        System.out.println(this.vehicleName + " has crashed");
    }

    public void fly() {
        System.out.println(this.vehicleName + " is in the sky");
    }

    public void takeOff() {
        System.out.println(this.vehicleName + " is going vertical");
    }
}
