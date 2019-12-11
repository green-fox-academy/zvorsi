import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class writeSingleLine {
    public static void main(String[] args) throws IOException {

        insertStringTofile();

        try {
            insertStringTofile();
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }

    private static void insertStringTofile() throws IOException {
        Path path = Paths.get("src/my-file.txt");

        Scanner enterName = new Scanner(System.in);
        String myName = enterName.nextLine();

        List<String> fileName = new ArrayList();
        fileName.add(myName);
        Path filePath = Paths.get("src/my-file.txt");
        Files.write(filePath, fileName);
    }
}
