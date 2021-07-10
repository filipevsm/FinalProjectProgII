package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;


public class GenerateOutputFiles {
    /**
     * This method is responsible for generating the final output file, the parameters passed are determined by
     * @param fileToBeGenerated
     * @param list
     * @throws IOException
     */
    public GenerateOutputFiles(String fileToBeGenerated, ArrayList<Employee> list) throws IOException {
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
                        Collections.sort(list, numberCompare);
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
                        Collections.sort(list, lastNameCompare);
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
                        Collections.sort(list, hourlyWageCompare);
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
                        Collections.sort(list, totalWageCompare);
                    } catch (
                            InputMismatchException e) {
                        System.out.println("Could not generate the file " + fileToBeGenerated);
                    }
                    break;
            }

            /**
             * This block will write the sorted list to the respective file.
             */
            for (Employee employee : list) {
                output.printf(employee.getEmployeeNumber() + " " +
                        employee.getFirstName() + " " +
                        employee.getLastName() + " " +
                        String.format("%02d", employee.getTimestamp().getHour()) + ":" + String.format("%02d", employee.getTimestamp().getMin()) + ":" + String.format("%02d", employee.getTimestamp().getSec()) + " " +
                        "$" + String.format("%.2f", employee.getHourlyWage()) + " " +
                        //THIS LINE BELLOW CALCULATES THE TOTAL PAY (FIXED ALREADY!)
                        "$" + String.format("%.2f", employee.getTotalWage()) + "\n");
            }

            /**
             * totalTimeStamp() sums the total time worked and total pay.
             */
            TimeStamp totalTimestamp = new TimeStamp(0, 0, 0);
            double totalPay = 0;
            for (int i = 0; i < list.size(); i++) {
                totalTimestamp.addHour(list.get(i).getTimestamp().getHour());
                totalTimestamp.addMin(list.get(i).getTimestamp().getMin());
                totalTimestamp.addSec(list.get(i).getTimestamp().getSec());
                totalPay += list.get(i).getTotalWage();
            }
            output.printf("Total time worked: " + String.format("%02d", totalTimestamp.getHour()) + ":" + String.format("%02d", totalTimestamp.getMin()) + ":" + String.format("%02d", totalTimestamp.getSec()) + "\n");
            output.flush();
            output.printf("Total pay: " + "$" + String.format("%.2f", totalPay));
            output.flush();
            writeFile.close();
        } catch (
                InputMismatchException e) {
            System.out.println("Could not find the input file.");
        }
    }
}