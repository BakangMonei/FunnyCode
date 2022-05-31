package finalAssignment;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class methodsClass implements interfaceGUI{
    // Done
    public void fileReadd() throws IOException {
        FileReader fr=new FileReader("C:\\Users\\cse20-018\\Desktop\\javaAssign\\poem.txt");
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }

    // Done
    public void fileWordSearcherr(){
        String word = "";
        int val = 0;
        //while(!word.("quit"))

        {
            System.out.println("Enter the word to be searched for: ");
            Scanner input = new Scanner(System.in);
            word = input.next();
            Scanner file = null;
            try {
                file = new Scanner(new File("poem.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            while (file.hasNextLine()) {
                String line = file.nextLine();
                if (line.indexOf(word) != -1) {
                    System.out.println("The Word" + " " + word + " " + "EXISTS in the Sorted file");
                    val = 1;
                    break;
                } else {
                    val = 0;
                    continue;
                }
            }
            if (val == 0) {
                System.out.println("Word does not exist");
            }

        }
    }

    // Done
    public void fileWritee(){
        // initialize a string
        String str = "Neiza Wa DI Operation";
        try {

            // attach a file to FileWriter
            FileWriter fw = new FileWriter("C:\\Users\\cse20-018\\Desktop\\javaAssign\\poem.txt");

            // read each character from string and write
            // into FileWriter
            for (int i = 0; i < str.length(); i++)
                fw.write(str.charAt(i));

            System.out.println("Successfully written");

            // close the file
            fw.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }

    // Done
    public void ProgramRuntimee(){
        try{
            Object interruptedException = null;
            // Object interruptedException1 = interruptedException;
            {

                long start = System.nanoTime();

                // -------- program --------

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // -------------------------------

                long duration = (System.nanoTime() - start) / 1000000;
                System.out.println(duration + "ms");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Done
    public void WordBubbleSortt(){
        long startTime; // Starting time of program, in milliseconds.
        long endTime; // Time when computations are done, in milliseconds.
        double time; // Time difference, in seconds.
        startTime = System.currentTimeMillis();


        endTime = System.currentTimeMillis();
        time = (endTime - startTime) / 1000.0;
        System.out.print("\nRun time in seconds was: ");
        System.out.println(time);
    }

    // Done
    public void WordCountt() throws IOException {
        String line;
        int count = 0;

        //Opens a file in read mode
        FileReader file = new FileReader("poem.txt");
        BufferedReader br = new BufferedReader(file);

        //Gets each line till end of file is reached
        while((line = br.readLine()) != null) {
            //Splits each line into words
            String words[] = line.split(" ");
            //Counts each word
            count = count + words.length;
        }

        System.out.println("Number of words in the file are : " + count);
        br.close();
    }

    // Done
    public void WordSelectionn() throws IOException {
        Path outputFile = Paths.get("C:\\Users\\cse20-018\\Desktop\\javaAssign\\output.txt");
        ArrayList<String> randomWords1 = randomWordsFromFile("C:\\Users\\cse20-018\\Desktop\\javaAssign\\poem.txt", 20);
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
