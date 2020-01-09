package Sum;

import java.util.ArrayList;

public class Sum {

    ArrayList<Integer> numbers;

    public Sum(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public Integer adder(ArrayList<Integer> numbers) {
        Integer total = 0;
        for (Integer number : numbers) {
            total = total + number;
        }
        return total;
    }
}
