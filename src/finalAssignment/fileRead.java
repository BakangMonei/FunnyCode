package finalAssignment;

import java.io.FileReader;
import java.io.IOException;

public class fileRead {
    static {
        // FileReader = read the contents of a file as a stream of characters. One by one
        //		      read() returns an int value which contains the byte value
        //			  when read() returns -1, there is no more data to be read

        try {
            FileReader reader = new FileReader("C:\\Users\\cse21-091\\IdeaProjects\\ASSIGNMENTrw\\src\\poem.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
