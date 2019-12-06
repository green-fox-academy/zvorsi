import java.util.Scanner;

public class oneTwoLot {
    public static void main(String[] args) {

        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");

        int number = scanner.nextInt();

        if (number < 0){
            System.out.println("not enough");
        }else if(number == 1){
            System.out.println("one");
        }else if (number == 2){
            System.out.println("two");
        }if (number > 2){
            System.out.println("a lot");
        }

    }
}
