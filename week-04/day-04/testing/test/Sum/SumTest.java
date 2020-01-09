package Sum;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void adder() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        Sum total = new Sum(numbers);

        assertEquals(Integer.valueOf(12), total.adder(numbers));
    }

    @Test
    public void adderEmpty() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Sum total = new Sum(numbers);

        assertEquals(Integer.valueOf(0), total.adder(numbers));
    }

    @Test
    public void adderSingleElement() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        Sum total = new Sum(numbers);

        assertEquals(numbers.get(0), total.adder(numbers));
    }

    @Test
    public void adderNull() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        Sum total = new Sum(numbers);

        assertEquals(null, total.adder(numbers));
    }
}