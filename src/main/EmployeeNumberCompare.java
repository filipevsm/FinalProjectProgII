package main;

import java.util.Comparator;
import java.util.InputMismatchException;


public class EmployeeNumberCompare implements Comparator<Employee> {
    /**
     * This method will sort two Employee objects by comparing their EmployeeNumber value.
     * Will return a list in ascending order.
     *
     * @param employee1
     * @param employee2
     * @return
     */
    // maybe boolean?
    //
    public int compare(Employee employee1, Employee employee2) {
        try {
            if (employee1.getEmployeeNumber() < employee2.getEmployeeNumber()) return -1;
            if (employee1.getEmployeeNumber() > employee2.getEmployeeNumber()) return 1;
            else return 0;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}
