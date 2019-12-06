import java.util.Scanner;

public class averageOfInput {
    public static void main(String[] args) {

        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers");

        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int numberC = scanner.nextInt();
        int numberD = scanner.nextInt();
        int numberE = scanner.nextInt();

        int sum = numberA + numberB + numberC + numberD + numberE;
        float average = (float) sum / 5;

        System.out.println("sum of the inputs: " + sum);
        System.out.println("average of the inputs: " + average);

    }
}
