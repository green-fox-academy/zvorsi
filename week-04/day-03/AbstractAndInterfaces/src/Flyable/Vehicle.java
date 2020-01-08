package Flyable;

public class Vehicle {

    String vehicleName;
    String vehicleColor;
    Integer vehicleAge;

    public Vehicle() {
    }

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Vehicle(String vehicleName, String vehicleColor, Integer vehicleAge) {
        this.vehicleName = vehicleName;
        this.vehicleColor = vehicleColor;
        this.vehicleAge = vehicleAge;
    }
}
