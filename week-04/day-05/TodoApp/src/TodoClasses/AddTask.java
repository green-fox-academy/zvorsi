package TodoClasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class AddTask {
    private String arg;

    public AddTask() {
    }

    public AddTask(String arg) {
        this.arg = arg;
        addTaskToTheFile();
    }

    public void addTaskToTheFile() {
        Path filePath = Paths.get("src/TodoTask/task.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            lines.add("[ ] " + arg);
            Files.write(filePath, lines);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
