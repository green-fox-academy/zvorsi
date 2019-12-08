import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        // *
        // **
        // ***
        // ****
        // The triangle should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++)
            {
            for (int j = 0; j <= i; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }

    }
}
