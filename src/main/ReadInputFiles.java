package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInputFiles {
    public ReadInputFiles(ArrayList<String> stringList, ArrayList<Employee> list) {
        int counter = 0;
        try {
            //READS THE INPUT FILE employees.txt AND IMPORT IT TO ARRAYLIST (ONE STRING PER LINE) - PART 1
            File readFile = new File("employees.txt");
            Scanner textRead = new Scanner(readFile);
            while (textRead.hasNext()) {
                stringList.add(textRead.next());
            }
            textRead.close();

            while (counter < stringList.size()) {
                String string = stringList.get(counter);
                String[] parts = string.split(",");
                list.add(new Employee(Integer.parseInt(parts[0]), parts[1], parts[2], Double.parseDouble(parts[3])));
                counter++;
            }
        } catch (InputMismatchException | FileNotFoundException e) {
            System.out.println("employees.txt not available");
        }

        try {
            //READS THE INPUT FILE employeesHours.txt AND IMPORT IT TO ARRAYLIST (SORTED EMPLOYEE FIELDS LIST) - PART 2
            File readFile = new File("employeesHours.txt");
            Scanner textRead = new Scanner(readFile);
            stringList.clear();
            while (textRead.hasNext()) {
                stringList.add(textRead.next());
            }

            for (int i = 0; i < list.size(); i++) {
                for (int y = 0; y < stringList.size(); y++) {
                    String string = stringList.get(y);
                    String[] parts = string.split(",|:");
                    if (list.get(i).getEmployeeNumber() == Integer.parseInt(parts[0])) {
                        list.get(i).getTimestamp().addHour(Integer.parseInt(parts[1]));
                        list.get(i).getTimestamp().addMin(Integer.parseInt(parts[2]));
                        list.get(i).getTimestamp().addSec(Integer.parseInt(parts[3]));
                    }
                }
            }

        } catch (InputMismatchException | FileNotFoundException e) {
            System.out.println("employeesHours.txt not available");
        }
    }
}
