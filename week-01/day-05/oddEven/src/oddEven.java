import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number and I tell whether it is odd or even");

        int number =scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
