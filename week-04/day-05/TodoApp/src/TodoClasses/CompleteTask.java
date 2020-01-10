package TodoClasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CompleteTask {

    private String arg;

    public CompleteTask() {
    }

    public CompleteTask(String arg) {
        this.arg = arg;
        completesTaskInTheFile();
    }

    public void completesTaskInTheFile() {
        Path filePath = Paths.get("src/TodoTask/task.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            int index = Integer.valueOf(arg);

            //beirni az adott index+1 (?) sorszamu feladatot, [X] jellel,
            // az alatta levo ures jelolesu azonos tartalmut kitorolni

            //valami substringes megoldas???

            //a beirt sorszámu taskot be kell jelolni, esetleg az adott sorszamu elemet torolje,
            // es ugyanarra az indexre irja vissza kiegeszitve?

            //lines.add(lines.contains(index-1) + arg);
            //lines.add(index-1, "[X] " + arg);
            //lines.add(arg); //ez igy nem jo, beirja ujra a taskot
            lines.set(index-1, lines.get(index-1).replace("[ ]", "[x]") );
            Files.write(filePath, lines);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
