package Fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void fibonacciElementFour() {
        assertEquals(3, fibonacci.fibonacci(4));
    }

    @Test
    public void fibonacciElementZero() {
        assertEquals(0, fibonacci.fibonacci(0));
    }
}