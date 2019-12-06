import java.util.Scanner;

public class secondsInADay {
    public static void main(String[] args) {

        Scanner myTime = new Scanner(System.in);

        System.out.println("enter current hour, minute, second");


        int currentHours = myTime.nextInt();
        int currentMinutes = myTime.nextInt();
        int currentSeconds = myTime.nextInt();

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int dayHour = 24;
        int hourMinute = 60;
        int minuteSecond = 60;
        int daySeconds = ( dayHour * hourMinute * minuteSecond );
        int currentTimeSpent = ( (currentHours * hourMinute * minuteSecond) + (currentMinutes * minuteSecond) + (currentSeconds) );
        System.out.println(currentTimeSpent);
        System.out.println("remaining seconds: " + (daySeconds - currentTimeSpent));
    }
}
