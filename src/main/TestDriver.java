package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args) throws IOException {
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Employee> employeeList = new ArrayList<>();

        //START THE PROGRAM BY PROCESSING THE TWO INPUT FILES PRIOR TO SHOW THE MENU
        new ReadInputFiles(stringList,employeeList);

        //USER MENU TO SELECT WHAT FILE TO BE OUTPUTTED / EXHIBITED ON SCREEN
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
                    //OUTPUTS THE DATA GENERATING THE FILE "employeeNumberOrder.txt"
                    new GenerateOutputFiles(outputFile,employeeList);

                    //READS THE FILE AND OUTPUTS IT IN RUN CONSOLE
                    new ReadFileToRuntime(outputFile);

                    break;
                case 2:
                    outputFile = "nameOrder.txt";
                    //OUTPUTS THE DATA GENERATING THE FILE "nameOrder.txt"
                    new GenerateOutputFiles(outputFile,employeeList);

                    //READS THE FILE AND OUTPUTS IT IN RUN CONSOLE
                    new ReadFileToRuntime(outputFile);

                    break;
                case 3:
                    outputFile = "timeOrder.txt";
                    //OUTPUTS THE DATA GENERATING THE FILE "timeOrder.txt"
                    new GenerateOutputFiles(outputFile,employeeList);

                    //READS THE FILE AND OUTPUTS IT IN RUN CONSOLE
                    new ReadFileToRuntime(outputFile);

                    break;
                case 4:
                    outputFile = "payOrder.txt";
                    //OUTPUTS THE DATA GENERATING THE FILE "payOrder.txt"
                    new GenerateOutputFiles(outputFile,employeeList);

                    //READS THE FILE AND OUTPUTS IT IN RUN CONSOLE
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