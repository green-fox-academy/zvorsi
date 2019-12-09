import java.util.Scanner;

public class greet {
    public static void main(String[] args) {

        //  From now on, create the usual class wrapper
        //  and main method on your own.
        // - Create a string variable named `al` and assign the value `Green Fox` to it
        // - Create a function called `greet` that greets it's input parameter
        // - Greeting is printing e.g. `Greetings dear, Green Fox`
        // - Greet `al`

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String al = scanner.nextLine();
        greet(al);

    }

    public static void greet(String b) {
        System.out.print("Greetings, dear " + b + "!");
    }

}
