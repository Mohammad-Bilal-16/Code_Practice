package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("FileWriterFile.txt");
        fileWriter.write("This text ie written by File Writer!!!!");
        fileWriter.flush();
        fileWriter.close();

    }
}
