package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args) throws IOException {
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Employee> list = new ArrayList<>();
        int counter = 0;
        try {
            //READS THE INPUT FILE employees.txt AND IMPORT IT TO ARRAYLIST - PART 1
            File readFile = new File("employees.txt");
            Scanner textRead = new Scanner(readFile);
            while (textRead.hasNext()) {
                stringList.add(textRead.next());
            }
            textRead.close();

            counter = 0;
            while (counter < stringList.size()) {
                String string = stringList.get(counter);
                String[] parts = string.split(",");
                list.add(new Employee(Integer.parseInt(parts[0]), parts[1], parts[2], Double.parseDouble(parts[3])));
                counter++;
            }
            counter = 0;
        } catch (InputMismatchException e) {
            System.out.println("employees.txt not available");
        }

        try {
            //READS THE INPUT FILE employeesHours.txt AND IMPORT IT TO ARRAYLIST - PART 2
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

        } catch (InputMismatchException e) {
            System.out.println("employeesHours.txt not available");
        }

        Scanner input = new Scanner(System.in);
        counter = 0;
        while (counter >= 0 && counter <= 4) {
            System.out.println("\nType 1 to generate the employeeNumberOrder.txt\n" +
                    "Type 2 to generate the nameOrder.txt\n" +
                    "Type 3 to generate the timeOrder.txt\n" +
                    "Type 4 to generate the payOrder.txt\n" +
                    "Type 5 to EXIT the program.");

            counter = input.nextInt();
            switch (counter) {
                case 1:
                    try {
                        //OUTPUTS THE DATA GENERATING A FILE - THIS ONE IS NOT OUTPUTTING THE FILE AS IT SHOULD...
                        FileOutputStream writeFile = new FileOutputStream("test.txt");
//                        ObjectOutputStream output = new ObjectOutputStream(writeFile);
                        PrintWriter output = new PrintWriter(writeFile);

                        output.printf("Emp # Last Name First Name Time Worked Hourly Wage Pay\n");
                        EmployeeNumberCompare numberCompare = new EmployeeNumberCompare();
                        Collections.sort(list, numberCompare);
                        for (Employee employee : list) {
                            output.printf(employee.getEmployeeNumber() + " " +
                                    employee.getFirstName() + " " +
                                    employee.getLastName() + " " +
                                    String.format("%02d", employee.getTimestamp().getHour()) + ":" + String.format("%02d", employee.getTimestamp().getMin()) + ":" + String.format("%02d", employee.getTimestamp().getSec()) + " " +
                                    "$" + String.format("%.2f", employee.getHourlyWage()) + " " +
                                    //THIS LINE BELLOW CALCULATES THE TOTAL PAY
                                    "$" + String.format("%.2f", ((employee.getHourlyWage() * employee.getTimestamp().getHour()) + (employee.getHourlyWage() * (employee.getTimestamp().getMin() * 0.02) + ((employee.getHourlyWage() * (employee.getTimestamp().getSec() * 0.02)) / 60)))) + "\n");
                        }

                        //SUMS THE TOTAL TIME WORKED AND TOTAL PAYS
                        TimeStamp totalTimestamp = new TimeStamp(0, 0, 0);
                        double totalPay = 0;
                        for (int i = 0; i < list.size(); i++) {
                            totalTimestamp.addHour(list.get(i).getTimestamp().getHour());
                            totalTimestamp.addMin(list.get(i).getTimestamp().getMin());
                            totalTimestamp.addSec(list.get(i).getTimestamp().getSec());
                            totalPay += ((list.get(i).getHourlyWage() * list.get(i).getTimestamp().getHour()) + (list.get(i).getHourlyWage() * (list.get(i).getTimestamp().getMin() * 0.02) + ((list.get(i).getHourlyWage() * (list.get(i).getTimestamp().getSec() * 0.02)) / 60)));
                        }

                        output.printf("Total time worked: " + String.format("%02d", totalTimestamp.getHour()) + ":" + String.format("%02d", totalTimestamp.getMin()) + ":" + String.format("%02d", totalTimestamp.getSec()) + "\n");
                        output.printf("Total pay: " + "$" + String.format("%.2f", totalPay));
                        writeFile.close();
                    } catch (InputMismatchException e) {
                        System.out.println("Could not generate the file employeeNumberOrder.txt");
                    }

                    //READS THE FILE AND OUTPUTS IT IN RUN CONSOLE
                    try {
                        File file = new File("employeeNumberOrder.txt");
                        Scanner textRead = new Scanner(file);

                        while (textRead.hasNext()) {
                            System.out.println((String) textRead.nextLine());
                        }
                        textRead.close();

                        counter = 0;
                        break;
                    } catch (IOException e) {
                        System.out.println("Error reading the file employeeNumberOrder.txt");
                    }

                case 2:
                    //NEED TO WRITE CODE TO GENERATE nameOrder.txt HERE

                    //READS THE FILE AND OUTPUTS IT IN RUN CONSOLE
                    try {
                        File file = new File("nameOrder.txt");
                        Scanner textRead = new Scanner(file);

                        while (textRead.hasNext()) {
                            System.out.println((String) textRead.nextLine());
                        }
                        textRead.close();

                        counter = 0;
                        break;
                    } catch (IOException e) {
                        System.out.println("Error reading the file nameOrder.txt");
                    }
                case 3:
                    //NEED TO WRITE CODE TO GENERATE timeOrder.txt HERE

                    //READS THE FILE AND OUTPUTS IT IN RUN CONSOLE
                    try {
                        File file = new File("timeOrder.txt");
                        Scanner textRead = new Scanner(file);

                        while (textRead.hasNext()) {
                            System.out.println((String) textRead.nextLine());
                        }
                        textRead.close();

                        counter = 0;
                        break;
                    } catch (IOException e) {
                        System.out.println("Error reading the file timeOrder.txt");
                    }
                case 4:
                    //NEED TO WRITE CODE TO GENERATE payOrder.txt HERE

                    //READS THE FILE AND OUTPUTS IT IN RUN CONSOLE
                    try {
                        File file = new File("payOrder.txt");
                        Scanner textRead = new Scanner(file);

                        while (textRead.hasNext()) {
                            System.out.println((String) textRead.nextLine());
                        }
                        textRead.close();

                        counter = 0;
                        break;
                    } catch (IOException e) {
                        System.out.println("Error reading the file payOrder.txt");
                    }
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


//        ArrayList<Employee> list = new ArrayList<Employee>();
//        list.add(new Employee(111111,"Aaaaaa","Bbbbbb",10.5));
//        list.add(new Employee(333333,"Zzzzzz","Yyyyyy",5.0));
//        list.add(new Employee(222222,"Cccccc","Dddddd",5.0));
//        list.add(new Employee(555555,"Mmmmmm","Nnnnnn",15.0));

//        new GenerateFileCompare(list);
//new ReadFile("test.txt");

        /* OUTPUTS THE DATA GENERATING A FILE
        FileOutputStream file = new FileOutputStream("test.txt");
        ObjectOutputStream output = new ObjectOutputStream(file);

        output.writeChars("Sort by Employee Number:");
        EmployeeNumberCompare numberCompare = new EmployeeNumberCompare();
        Collections.sort(list, numberCompare);
        for (Employee employee: list)
            output.writeObject(employee.getEmployeeNumber() + " " +
                               employee.getFirstName() + " " +
                               employee.getLastName() + " " +
                               employee.getHourlyWage());

        output.writeChars("\nSort by Employee Last Name:");
        EmployeeLastNameCompare lastNameCompare = new EmployeeLastNameCompare();
        Collections.sort(list, lastNameCompare);
        for (Employee employee: list)
            output.writeObject(employee.getEmployeeNumber() + " " +
                    employee.getFirstName() + " " +
                    employee.getLastName() + " " +
                    employee.getHourlyWage());

        output.writeChars("\nSort by Hourly Wage:");
        EmployeeHourlyWageCompare hourlyWageCompare = new EmployeeHourlyWageCompare();
        Collections.sort(list, hourlyWageCompare);
        for (Employee employee: list)
            output.writeObject(employee.getEmployeeNumber() + " " +
                    employee.getFirstName() + " " +
                    employee.getLastName() + " " +
                    employee.getHourlyWage());
         */

// OUTPUTS THE DATA WITHOUT GENERATING A FILE
//        System.out.println("Sort by Employee Number:");
//        EmployeeNumberCompare numberCompare = new EmployeeNumberCompare();
//        Collections.sort(list, numberCompare);
//        for (Employee employee: list)
//            System.out.println(employee.getEmployeeNumber() + " " +
//                               employee.getFirstName() + " " +
//                               employee.getLastName() + " " +
//                               employee.getHourlyWage());
//
//        System.out.println("\nSort by Employee Last Name:");
//        EmployeeLastNameCompare lastNameCompare = new EmployeeLastNameCompare();
//        Collections.sort(list, lastNameCompare);
//        for (Employee employee: list)
//            System.out.println(employee.getEmployeeNumber() + " " +
//                    employee.getFirstName() + " " +
//                    employee.getLastName() + " " +
//                    employee.getHourlyWage());
//
//        System.out.println("\nSort by Hourly Wage:");
//        EmployeeHourlyWageCompare hourlyWageCompare = new EmployeeHourlyWageCompare();
//        Collections.sort(list, hourlyWageCompare);
//        for (Employee employee: list)
//            System.out.println(employee.getEmployeeNumber() + " " +
//                    employee.getFirstName() + " " +
//                    employee.getLastName() + " " +
//                    employee.getHourlyWage());