package finalAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileWordSearcher {
    public static void main(String[] args) {


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
}
