package Reservations;


import java.util.Random;

public class Reservation implements Reservationy{

    Random random = new Random();

    @Override
    public String getDowBooking() {
        int randomDay = 1 + random.nextInt(6);
        String name = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}[randomDay];
        return name;
    }


    @Override
    public String getCodeBooking() {

        return null;
    }
}
