import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class copyFile {
    public static void main(String[] args) throws IOException {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful


        try {
            copy();
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("copy done");
        }
    }

    private static void copy() throws IOException {
        Path filePathA = Paths.get("src/fileA.txt");
        Path filePathB = Paths.get("src/fileB.txt");
        List<String> allLines = Files.readAllLines(Paths.get("src/fileA.txt"));
        allLines.addAll(Files.readAllLines(Paths.get("src/fileB.txt")));
        Files.write(Paths.get("src/fileB.txt"), allLines);
    }
}
