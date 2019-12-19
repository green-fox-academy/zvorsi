package Bunnies;

public class Bunnies {
    public static void main(String[] args) {

        System.out.println(bunnyears(3));

    }

//    We have a number of bunnies and each bunny has two big floppy ears.
//    We want to compute the total number of ears across all the bunnies
//    recursively (without loops or multiplication).

    private static int bunnyears(int n) {
        if (n == 0) {
            return 0;
        }
        return 2 + bunnyears(n-1);
    }

}
