package finalAssignment;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class WordSelection {
    public static void main(String[] args) throws IOException {
        Path outputFile = Paths.get("output.txt");
        ArrayList<String> randomWords1 = randomWordsFromFile("poem.txt", 20);
      //  ArrayList<String> randomWords2 = randomWordsFromFile("poem.txt", 20);
        OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(outputFile, CREATE));
        System.out.println(randomWords1);
      //  System.out.println(randomWords2);
        outputStream.flush();
        for (int i = 0; i < randomWords1.size(); i++) {
            outputStream.write(randomWords1.get(i).getBytes());
        }

        outputStream.close();
    }

    private static ArrayList<String> randomWordsFromFile(String fileName, int count) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        ArrayList<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        return randomFromWords(words, count);
    }

    static private ArrayList<String> randomFromWords(ArrayList<String>     words, int count) {
        ArrayList<String> randomWords = new ArrayList<>();
        for (int i = 0; i < count; ) {
            int random = new Random().nextInt(words.size());
            if (randomWords.add(words.get(random))) {
                i++;
            }
        }
        return randomWords;
    }
}