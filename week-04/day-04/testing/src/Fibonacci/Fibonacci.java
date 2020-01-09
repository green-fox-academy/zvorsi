package Fibonacci;

public class Fibonacci {

    public int fibonacci(int n) {
        if ( (0 == n) || (1 == n) ) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
