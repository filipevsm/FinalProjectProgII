package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInputFiles {
    public ReadInputFiles(ArrayList<String> stringList, ArrayList<Employee> employeelist) {
        int counter = 0;
        try {
            /**
             * This block will read the input file "employees.txt" and import it to an Arraylist one string at a time.
             * Scanner object will read the contents of the file and store data in stringList. Scanner will automatically
             * close the file once it detects that there is no more data.
             * The while loop is creating a new array named parts to store each value read from the text file.
             * Loop will run until counter reaches the same value as the size of stringList.
             */
            File readFile = new File("employees.txt");
            Scanner textRead = new Scanner(readFile);
            while (textRead.hasNext()) {
                stringList.add(textRead.next());
            }
            textRead.close();

            while (counter < stringList.size()) {
                String string = stringList.get(counter);
                String[] parts = string.split(",");
                employeelist.add(new Employee(Integer.parseInt(parts[0]), parts[1], parts[2], Double.parseDouble(parts[3])));
                counter++;
            }
        } catch (InputMismatchException | FileNotFoundException e) {
            System.out.println("employees.txt not found. Please verify file path.");
        }

        try {
            /**
             * This block will read the file "employeesHours.txt" and import it to the Arraylist.
             * Scanner object will read the contents of the file, and close automatically when it reaches the end.
             * for loop is doing ____
             */

            File readFile = new File("employeesHours.txt");
            Scanner textRead = new Scanner(readFile);
            stringList.clear();
            while (textRead.hasNext()) {
                stringList.add(textRead.next());
            }
            // unclear about this part
            //employeelist.get(i).getEmployeeNumber() == Integer.parseInt(parts[0]
            // first part is accessing an employee in the list and getting their #
            // second part is parsing the data in the list to find the emp #
            // then comparing?

            for (int i = 0; i < employeelist.size(); i++) {
                for (int y = 0; y < stringList.size(); y++) {
                    String string = stringList.get(y);
                    String[] parts = string.split(",|:");
                    if (employeelist.get(i).getEmployeeNumber() == Integer.parseInt(parts[0])) {
                        employeelist.get(i).getTimestamp().addHour(Integer.parseInt(parts[1]));
                        employeelist.get(i).getTimestamp().addMin(Integer.parseInt(parts[2]));
                        employeelist.get(i).getTimestamp().addSec(Integer.parseInt(parts[3]));
                    }
                }
            }

        } catch (InputMismatchException | FileNotFoundException e) {
            System.out.println("employeesHours.txt not found. Please verify file path");
        }
    }
}
