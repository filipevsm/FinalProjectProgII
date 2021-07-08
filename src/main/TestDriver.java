package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        while (counter >= 0 && counter <= 4) {
            System.out.println("Type 1 to generate the employeeNumberOrder.txt\n" +
                    "Type 2 to generate the nameOrder.txt\n" +
                    "Type 3 to generate the timeOrder.txt\n" +
                    "Type 4 to generate the payOrder.txt\n" +
                    "Type 5 to EXIT the program.");
            counter = input.nextInt();
            switch (counter) {
                case 1:
                    try {
                        File file = new File("employees.txt");
                        Scanner textRead = new Scanner(file);

                        while (textRead.hasNext()) {
                            System.out.println((String)textRead.next());
                        }

                        textRead.close();
                    } catch (IOException e) {
                        System.out.println("Error");
                    }
                case 2: //CALL THE nameOrder.txt GENERATOR
                case 3: //CALL THE timeOrder.txt GENERATOR
                case 4: //CALL THE payOrder.txt GENERATOR
                case 5:
                    break;
                default:
                    System.out.println("Type a valid option.");
                    counter = 0;
                    break;
            }


//            System.out.println("\nSort by Employee Last Name:");
//            EmployeeLastNameCompare lastNameCompare = new EmployeeLastNameCompare();
//            Collections.sort(list, lastNameCompare);
//            for (Employee employee: list)
//                System.out.println(employee.getEmployeeNumber() + " " +
//                        employee.getFirstName() + " " +
//                        employee.getLastName() + " " +
//                        employee.getHourlyWage());
//
//            System.out.println("\nSort by Hourly Wage:");
//            EmployeeHourlyWageCompare hourlyWageCompare = new EmployeeHourlyWageCompare();
//            Collections.sort(list, hourlyWageCompare);
//            for (Employee employee: list)
//                System.out.println(employee.getEmployeeNumber() + " " +
//                        employee.getFirstName() + " " +
//                        employee.getLastName() + " " +
//                        employee.getHourlyWage());
        }

        //Every time you write to a report file, also output to the screen. CREATE A METHOD TO READ FILE?
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