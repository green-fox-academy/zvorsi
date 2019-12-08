import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a character and a number");

            String c = scanner.nextLine();
            int square = scanner.nextInt();

            //kiirja ay elso sort
            for (int i = 0; i < square; i++){
                System.out.print(c);
            }
            System.out.print("\n");

            for (int i = 0; i < square - 2; i++){
                System.out.print(c);

                for (int j = 0; j < square-2; j++) {
                    if (i == j) {
                        System.out.print(c);
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println(c);
            }
            for (int i = 0; i < square; i++){
                System.out.print(c);
            }
    }
}
