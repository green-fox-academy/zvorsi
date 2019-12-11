import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class countLines {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("give a filename");
        String filename = scanner.nextLine();


        try {
            int lineCount = (int) Files.lines(Paths.get("src/" + filename)).count();
            System.out.println(lineCount);
        } catch (Exception e) {
            System.out.println(0);
        }
    }
}
