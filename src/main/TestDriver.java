package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the driver class.
 */


public class TestDriver {
    public static void main(String[] args) throws IOException {
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Employee> employeeList = new ArrayList<>();

        /**
         * Program starts by processing the two input files (employees.txt, employeesHours.txt) prior
         * to showing the menu.
         */
        new ReadInputFiles(stringList,employeeList);


        /**
         * Generates a menu for the user to select which file is to be displayed.
         */
        Scanner input = new Scanner(System.in);
        int counter = 0;
        while (counter >= 0 && counter <= 4) {
            System.out.println("\nType 1 to generate the employeeNumberOrder.txt\n" +
                    "Type 2 to generate the nameOrder.txt\n" +
                    "Type 3 to generate the timeOrder.txt\n" +
                    "Type 4 to generate the payOrder.txt\n" +
                    "Type 5 to EXIT the program.");

            counter = input.nextInt();
            String outputFile;
            switch (counter) {
                case 1:
                    outputFile = "employeeNumberOrder.txt";
                    /**
                     * Outputs the appropriate data to generate "employeeNumberOrder.txt".
                     * @see EmployeeNumberCompare.java
                     */
                    new GenerateOutputFiles(outputFile,employeeList);

                    /**
                     * Reads the file that was just generated above and outputs it to the console.
                     * @see GenerateOutputFiles.java
                     */
                    new ReadFileToRuntime(outputFile);

                    break;
                case 2:
                    outputFile = "nameOrder.txt";

                    /**
                     * Outputs the appropriate data to generate "nameOrder.txt".
                     * @see EmployeeLastNameCompare.java
                     */
                    new GenerateOutputFiles(outputFile,employeeList);
                    /**
                     *  Reads the file that was just generate above and outputs it to the console.
                     * @see GenerateOutputFiles.java
                     */
                    new ReadFileToRuntime(outputFile);

                    break;
                case 3:
                    outputFile = "timeOrder.txt";

                    /**
                     * Outputs the appropriate data to generate "timeOrder.txt".
                     * @see EmployeeTimeCompare.java
                     */
                    new GenerateOutputFiles(outputFile,employeeList);

                    /**
                     *  Reads the file that was just generate above and outputs it to the console.
                     * @see GenerateOutputFiles.java
                     */
                    new ReadFileToRuntime(outputFile);

                    break;
                case 4:
                    outputFile = "payOrder.txt";
                    /**
                     * Outputs the appropriate data to generate "payOrder.txt".
                     * @see EmployeeTotalWageCompare.java
                     */
                    new GenerateOutputFiles(outputFile,employeeList);

                    /**
                     *  Reads the file that was just generate above and outputs it to the console.
                     * @see GenerateOutputFiles.java
                     */
                    new ReadFileToRuntime(outputFile);

                    break;
                case 5:
                    break;
                default:
                    System.out.println("Type a valid option.");
                    counter = 0;
                    break;
            }
        }
    }
}