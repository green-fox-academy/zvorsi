package SumDigit;

public class sumDigits {
    public static void main(String[] args) {

        System.out.println(sumDigitsOf(111));
    }

    private static int sumDigitsOf(int n) {

        int k = n % 10;

        if (n / 10 < 10) {
            return k + n / 10;
        } else {
            return k + sumDigitsOf(n / 10);
        }
    }
}
