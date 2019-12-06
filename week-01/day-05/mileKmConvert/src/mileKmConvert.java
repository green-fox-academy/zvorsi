import java.util.Scanner;

public class mileKmConvert {

    // Write a program that asks for a double that is a distance in miles,
    // then it converts that value to kilometers and prints it

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a length in mile");

        double mile = scanner.nextDouble();
        System.out.println("that is in km: " + (mile * 1.609344));
    }
}
