import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        // Surface Area: 600
        // Volume: 1000

        Scanner scanner = new Scanner(System.in);
        System.out.println( "enter 3 numbers for a cuboid's side: " );

        double sideA = scanner.nextDouble();
        // System.out.println(sideA);

        double sideB = scanner.nextDouble();
        // System.out.println(sideB);

        double sideC = scanner.nextDouble();
        //System.out.println(sideC);

        double sideD = ( sideA * sideB ) * 2;
        double sideE = ( sideA * sideC ) * 2;
        double sideF = ( sideB * sideC ) * 2;

        System.out.println( "Surface of cuboid: " + ( sideD + sideE + sideF ));
        System.out.println( "Volume of cuboid: " + sideA * sideB * sideC );
    }
}
