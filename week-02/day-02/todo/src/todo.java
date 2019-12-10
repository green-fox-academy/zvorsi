import java.util.ArrayList;
import java.util.Scanner;

public class todo {
    public static void main(String[] args) {

        System.out.println("My todo list, enter something: ");

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> todo = new ArrayList<>();
        String todoElement = scanner.nextLine();
//        todoElement.split(",");
        todo.add("- " + todoElement);
        todo.add("- download games");
        todo.add("- Diablo");

        // String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //  - Diablo
        for (String task: todo){
            System.out.println(task);
        }
    }
}
