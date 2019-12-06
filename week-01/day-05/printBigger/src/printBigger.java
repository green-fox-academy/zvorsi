import java.util.Scanner;

public class printBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println(A + " is bigger");
        } else if (A == B) {
            System.out.println("equals");
        } else {
            System.out.println(B + " is bigger");
        }
    }
}