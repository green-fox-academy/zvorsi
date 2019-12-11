import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class printEachLine {
    public static void main(String[] args) throws IOException {

        try {
            Path path = Paths.get("src/my-file.txt");
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
        } catch (Exception e) {
            System.out.println("couldn't read");
        }

    }
}
