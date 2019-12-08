import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");

        int row = scanner.nextInt();

        for (int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= row - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i)-1; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = row - 1; i > 0; i--)
        {
            for (int j = 1; j <= row - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i)-1; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
