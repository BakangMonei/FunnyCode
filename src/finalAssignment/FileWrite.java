package finalAssignment;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    static {
        try (FileWriter writer = new FileWriter("poem.txt")) {
            writer.write("he asks me what i do\ni tell him i work for a small company \nthat makes packaging for— \nhe stops me midsentence");
            writer.append("\n(Anthology by Rupi kaur)");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
