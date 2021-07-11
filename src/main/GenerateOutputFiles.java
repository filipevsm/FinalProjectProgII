package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;


public class GenerateOutputFiles {
    /**
     * This method is responsible for generating the final output file, the parameters passed are determined by
     * the selection made by the user in the menu.
     * @param fileToBeGenerated chosen in menu.
     * @param employeeList
     * @throws IOException
     */
    public GenerateOutputFiles(String fileToBeGenerated, ArrayList<Employee> employeeList) throws IOException {
        try {
            FileOutputStream writeFile = new FileOutputStream(fileToBeGenerated);
            PrintWriter output = new PrintWriter(writeFile);

            output.printf("Emp # Last Name First Name Time Worked Hourly Wage Pay\n");
            output.flush();
            switch (fileToBeGenerated) {
                case "employeeNumberOrder.txt":
                    try {
                        /**
                         * This try block will attempt to generate the file "employeeNumberOrder.txt".
                         */
                        EmployeeNumberCompare numberCompare = new EmployeeNumberCompare();
                        Collections.sort(employeeList, numberCompare);
                    } catch (
                            InputMismatchException e) {
                        System.out.println("Could not generate the file " + fileToBeGenerated);
                    }
                    break;
                case "nameOrder.txt":
                    try {
                        /**
                         * This try block will attempt to generate the file "nameOrder.txt".
                         */
                        EmployeeLastNameCompare lastNameCompare = new EmployeeLastNameCompare();
                        Collections.sort(employeeList, lastNameCompare);
                    } catch (
                            InputMismatchException e) {
                        System.out.println("Could not generate the file " + fileToBeGenerated);
                    }
                    break;
                case "timeOrder.txt":
                    try {
                        /**
                         * This try block will attempt to generate the file "timeOrder.txt".
                         */
                        EmployeeTimeCompare hourlyWageCompare = new EmployeeTimeCompare();
                        Collections.sort(employeeList, hourlyWageCompare);
                    } catch (
                            InputMismatchException e) {
                        System.out.println("Could not generate the file " + fileToBeGenerated);
                    }
                    break;
                case "payOrder.txt":
                    try {
                        /**
                         * This try block will attempt to generate the file "payOrder.txt".
                         */
                        EmployeeTotalWageCompare totalWageCompare = new EmployeeTotalWageCompare();
                        Collections.sort(employeeList, totalWageCompare);
                    } catch (
                            InputMismatchException e) {
                        System.out.println("Could not generate the file " + fileToBeGenerated);
                    }
                    break;
            }

            /**
             * This block will write the sorted list to the respective file.
             */
            for (Employee employee : employeeList) {
                output.printf(employee.getEmployeeNumber() + " " +
                        employee.getFirstName() + " " +
                        employee.getLastName() + " " +
                        String.format("%02d", employee.getTimestamp().getHour()) + ":" + String.format("%02d", employee.getTimestamp().getMin()) + ":" + String.format("%02d", employee.getTimestamp().getSec()) + " " +
                        "$" + String.format("%.2f", employee.getHourlyWage()) + " " +
                        "$" + String.format("%.2f", employee.getTotalWage()) + "\n");
            }

            /**
             * totalTimeStamp() sums the total time worked and total pay.
             */
            TimeStamp totalTimestamp = new TimeStamp(0, 0, 0);
            double totalPay = 0;
            for (int i = 0; i < employeeList.size(); i++) {
                totalTimestamp.addHour(employeeList.get(i).getTimestamp().getHour());
                totalTimestamp.addMin(employeeList.get(i).getTimestamp().getMin());
                totalTimestamp.addSec(employeeList.get(i).getTimestamp().getSec());
                totalPay += employeeList.get(i).getTotalWage();
            }
            output.printf("Total time worked: " + String.format("%02d", totalTimestamp.getHour()) + ":" + String.format("%02d", totalTimestamp.getMin()) + ":" + String.format("%02d", totalTimestamp.getSec()) + "\n");
            output.flush();
            output.printf("Total pay: " + "$" + String.format("%.2f", totalPay));
            output.flush();
            writeFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not find the input file.");
        }
    }
}