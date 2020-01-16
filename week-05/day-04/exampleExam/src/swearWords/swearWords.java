package swearWords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class swearWords {
    public static void main(String[] args) throws IOException {

        List<String> swearText = readFile("src/swearWords/swearWords.txt");

        System.out.println(swearText);

        System.out.println(filterBadWords(swearText));

    }

    public static List<String> readFile(String fileName) {
        try {
            Path filePath = Paths.get(fileName);
            return Files.readAllLines(filePath);
        } catch (Exception e) {
            System.out.println("file not read");
        }
        return null;
    }

    public static int filterBadWords(List<String> swearText) throws IOException {

        ArrayList<String> badWords = new ArrayList<>();
        ArrayList<String> friendlyText = new ArrayList<>();

        badWords.add("fuck");
        badWords.add("bloody");
        badWords.add("cock");
        badWords.add("fucker");
        badWords.add("shit");
        badWords.add("fuckstick");
        badWords.add("asshole");
        badWords.add("dick");
        badWords.add("piss");
        badWords.add("cunt");

        int counter = 0;

        for (String line : swearText) {
            String[] words = line.split(" ");
            ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
            for (String badWord : badWords) {
                for (int i = 0; i < wordsList.size(); i++) {
                    if (wordsList.get(i).toUpperCase().contains(badWord.toUpperCase())) {
                        counter++;
                        System.out.println(wordsList.get(i));
                        wordsList.remove(i);
                        i--;
                    }
                }
            }
            friendlyText.add(String.join(" ", wordsList));
        }
        Path path = Paths.get("src/swearWords/friendlyText.txt");
        Files.write(path, friendlyText);
        return counter;
    }
}
