import java.util.Scanner;

public class factorio {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.
        // - Create a function called `factorio`
        //   that returns it's input's factorial

        Scanner scanner = new Scanner(System.in);

        long number = getNumberFromUser(scanner);
        // Fill array
        long factorial = factorial(number);
        // long factorial = 1 * 2 * 3 * 4;
        System.out.println(factorial);

    }
    public static long getNumberFromUser(Scanner scanner){
        System.out.println("Please add a number: ");
        long number = scanner.nextLong();
        return number;
    }
    public static long factorial(long number){
        long factorial = 1;
        for (long i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
