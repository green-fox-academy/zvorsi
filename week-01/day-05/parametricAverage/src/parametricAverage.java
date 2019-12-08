import java.util.Scanner;

public class parametricAverage {
    public static void main(String[] args) {

        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        float sum = 0;
        float ave = 0;

        for (int i = 0; i < number; i++){
            sum += scanner.nextFloat();
        }
        System.out.println("Sum: " + sum + ", Average: " + sum / number);

    }
}
