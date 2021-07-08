import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public ReadFile(String filePath) {
        try {
            File file = new File("test.txt");
            Scanner textRead = new Scanner(file);

            while (textRead.hasNext()) {
                System.out.println((String)textRead.next());
            }

            textRead.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
