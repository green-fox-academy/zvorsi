package BunniesAgain;

public class BunniesAgain {
    public static void main(String[] args) {

        System.out.println(bunnyears(4));
    }

    private static int bunnyears(int i) {
        if (i == 0) {
            return 0;
        } else if (i % 2 == 0) {
           return 3 + bunnyears(i - 1);
        }
        return 2 + bunnyears( i -1);
    }
}