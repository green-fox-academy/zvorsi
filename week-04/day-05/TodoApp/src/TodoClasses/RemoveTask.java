package TodoClasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RemoveTask {

    private String arg;

    public RemoveTask(){
    }

    public RemoveTask(String arg){
        this.arg = arg;
        removeTaskFromFile();
    }

    private void removeTaskFromFile() {
        Path filePath = Paths.get("src/TodoTask/task.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            int index = Integer.valueOf(arg);
            lines.remove(index - 1);
            Files.write(filePath, lines);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
