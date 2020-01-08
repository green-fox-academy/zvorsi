package Reservations;

public class main {
    public static void main(String[] args) {

        Reservation res1 = new Reservation();

        System.out.println("Booking# " + res1.getCodeBooking() + " for day " + res1.getDowBooking());
    }
}
