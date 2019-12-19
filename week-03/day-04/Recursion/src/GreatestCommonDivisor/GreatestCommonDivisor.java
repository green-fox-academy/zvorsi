package GreatestCommonDivisor;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(gcd(18, 9));

    }

    private static int gcd(int x, int y) {
        if( y == 0 ){
            return x;
        }
            return gcd(y, x % y);
    }
}
