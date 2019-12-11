import java.util.Scanner;

public class divideByZero {
    public static void main(String[] args) {

        int n = 0;
        divide(n);

    }

    private static void divide(int n) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number for dividing 10");
        n = scanner.nextInt();

        try {
            int result = 10 / n;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("error, cannot divide by zero");
        }
    }
}
