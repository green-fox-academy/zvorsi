import java.util.Scanner;

public class animalsLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter how many chicken and pig does a farmer have");

        int chickenLeg = scanner.nextInt();
        int pigLeg = scanner.nextInt();
        int totalChickenLeg = chickenLeg * 2;
        int totalPigLeg = pigLeg * 4;

        System.out.println("altogether the farmer has " + (totalChickenLeg + totalPigLeg) + " animal legs");
    }
}
