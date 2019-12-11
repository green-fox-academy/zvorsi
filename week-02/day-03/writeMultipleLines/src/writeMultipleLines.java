import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class writeMultipleLines {
    public static void main(String[] args) throws IOException {

        // Create a function that takes 3 parameters: a path, a word and a number
        // and is able to write into a file.
        // The path parameter should be a string that describes the location of the file you wish to modify
        // The word parameter should also be a string that will be written to the file as individual lines
        // The number parameter should describe how many lines the file should have.
        // If the word is 'apple' and the number is 5, it should write 5 lines
        // into the file and each line should read 'apple'
        // The function should not raise any errors if it could not write the file.


        try {
            askForInput();
        }catch (Exception e){
            System.out.println("something");
        }

    }

    private static void askForInput() throws IOException {
        Path path = Paths.get("src/my-file.txt");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();
        int counter = 5;

        List<String> fileName = new ArrayList();

        for (int i = 0; i < counter; i++) {
            fileName.add(word);

        }
        Files.write(path, fileName);
    }

}
