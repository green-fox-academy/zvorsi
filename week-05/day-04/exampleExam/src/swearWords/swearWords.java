package swearWords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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

    public static int filterBadWords(List<String> swearText) {

        ArrayList<String> badWords = new ArrayList<>();
        //a badWords array listbe berakjuk a felsorolt bad words, es removoljuk a swearText listabol,
        // es megszamoljuk, hányat removeolt
        //['fuck', 'bloody', 'cock', 'shit', 'fucker', 'fuckstick', 'asshole', 'dick', 'piss', 'cunt']
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

        for (String badWord : badWords) {
            for (String line : swearText) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.contains(badWord)) {
                        counter ++;
                        //System.out.println("have found one");
                    }
                }
                //irja egy uj file-ba a megmaradt textet
                //utana olvassa be azt is egy arraylistbe, es hasonlitsa ossze a hosszukat
                //return a kulonbseg
            }
        }
        return counter;
    }
}
