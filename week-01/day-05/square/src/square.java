import java.util.Arrays;
import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        String c = scanner.nextLine();
        int square = scanner.nextInt();


        for (int i = 0; i < square; i++){
            System.out.print(c);
        }
        System.out.print("\n");

        for (int i = 0; i < square - 2; i++){
            System.out.print(c);
            for (int j = 0; j < square-2; j++) {
                System.out.print(" ");
            }
            System.out.println(c);
        }
        for (int i = 0; i < square; i++){
            System.out.print(c);
        }


    }
}
