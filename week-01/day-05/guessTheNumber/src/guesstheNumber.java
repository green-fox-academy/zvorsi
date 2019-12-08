import com.sun.org.omg.CORBA.StructMemberSeqHelper;

import java.util.Scanner;

public class guesstheNumber {
    public static void main(String[] args) {

        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        Scanner scanner = new Scanner(System.in);
        boolean guess = false;
        int number = 7;

        while (!guess){
            int userNumber = scanner.nextInt();
            if (userNumber > number){
                System.out.println("the stored umber is lower");
            }else if(userNumber < number){
                System.out.println("the stored number is higher");
            }else{
                guess = true;
                System.out.println("Correct!");
            }
        }
    }
}
