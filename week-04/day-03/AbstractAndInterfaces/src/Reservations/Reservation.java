package Reservations;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy{

    Random random = new Random();

    @Override
    public String getDowBooking() {
        int randomDay = 1 + random.nextInt(6);
        String day = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}[randomDay];
        return day;
    }


    @Override
    public String getCodeBooking() {
        String result = "";
        for (int i = 0; i < 8 ; i++) {
            int randomChar = 1 + random.nextInt(35);
            String code = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}[randomChar];
            result+= code;
        }
        return result;
    }
}
