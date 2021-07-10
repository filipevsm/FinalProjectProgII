package main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileToRuntime {
    /**
     * Reads and displays the requested output file from the menu
     * @param fileToBeRead is chosen in the menu displayed in TestDriver.java
     */
    public ReadFileToRuntime(String fileToBeRead) {
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
