package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class GenerateFileCompare implements Serializable {
    public GenerateFileCompare(ArrayList<Employee> list) {
        try {
            FileOutputStream file = new FileOutputStream("test.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);

            output.writeChars("Sort by Employee Number:");
            EmployeeNumberCompare numberCompare = new EmployeeNumberCompare();
            Collections.sort(list, numberCompare);
            for (Employee employee : list)
                output.writeObject(employee.getEmployeeNumber() + " " +
                        employee.getFirstName() + " " +
                        employee.getLastName() + " " +
                        employee.getHourlyWage());

            output.writeChars("\nSort by Employee Last Name:");
            EmployeeLastNameCompare lastNameCompare = new EmployeeLastNameCompare();
            Collections.sort(list, lastNameCompare);
            for (Employee employee : list)
                output.writeObject(employee.getEmployeeNumber() + " " +
                        employee.getFirstName() + " " +
                        employee.getLastName() + " " +
                        employee.getHourlyWage());

            output.writeChars("\nSort by Hourly Wage:");
            EmployeeHourlyWageCompare hourlyWageCompare = new EmployeeHourlyWageCompare();
            Collections.sort(list, hourlyWageCompare);
            for (Employee employee : list)
                output.writeObject(employee.getEmployeeNumber() + " " +
                        employee.getFirstName() + " " +
                        employee.getLastName() + " " +
                        employee.getHourlyWage());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
