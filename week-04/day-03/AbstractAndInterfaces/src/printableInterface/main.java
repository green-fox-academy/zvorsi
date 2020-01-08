package printableInterface;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(3,2));
        dominoes.add(new Domino(4,6));

        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo("buy milk", "high", true));
        todos.add(new Todo("bake bread", "medium", false));

        for (Domino d : dominoes) {
            d.printAllFields();
        }

        for (Todo t : todos) {
            t.printAllFields();
        }
    }
}
