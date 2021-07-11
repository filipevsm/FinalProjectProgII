package main;

import java.util.Comparator;
import java.util.InputMismatchException;

public class EmployeeLastNameCompare implements Comparator<Employee>{
    /**
     * This method will sort two Employee objects by comparing their lastName value. Output will return the Employees
     * alphabetically (A-Z).
     *
     * @param employee1
     * @param employee2
     * @return -1 if emp1 < emp2
     *          1 if emp1 > emp2
     */

    public int compare(Employee employee1, Employee employee2) throws InputMismatchException{
            return employee1.getLastName().compareTo(employee2.getLastName());
        }
    }

