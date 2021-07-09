package main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileToRuntime {
    public ReadFileToRuntime(String fileToBeRead) {
        //READS FILES TO BE EXHIBITED ON SCREEN
        try {
            File file = new File(fileToBeRead);
            Scanner textRead = new Scanner(file);

            while (textRead.hasNext()) {
                System.out.println((String) textRead.nextLine());
            }
            textRead.close();
        } catch (IOException e) {
            System.out.println("Error reading the file " + fileToBeRead);
        }
    }
}
