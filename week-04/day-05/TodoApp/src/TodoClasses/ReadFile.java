package TodoClasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public ReadFile() {
        readFile();
    }

    private void readFile() {
        int counter = 1;
        Path filePath = Paths.get("src/TodoTask/task.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                System.out.println(counter + " " + line);
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
