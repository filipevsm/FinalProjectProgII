package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class TestDriver {
    public static void main(String[] args) throws IOException {
        //MENU Create a menu where I can choose which method I want to execute by choosing a number.
        //The menu should be displayed until I choose the exit option to stop the program from
        //running.

        //Every time you write to a report file, also output to the screen. CREATE A METHOD TO READ FILE?

        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(111111,"Aaaaaa","Bbbbbb",10.5));
        list.add(new Employee(333333,"Zzzzzz","Yyyyyy",5.0));
        list.add(new Employee(222222,"Cccccc","Dddddd",5.0));
        list.add(new Employee(555555,"Mmmmmm","Nnnnnn",15.0));

        new GenerateFileCompare(list);
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
    }
}