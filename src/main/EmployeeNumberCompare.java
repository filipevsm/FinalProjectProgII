package main;

import java.util.Comparator;



public class EmployeeNumberCompare implements Comparator<Employee> {
    /**
     * This method will sort two Employee objects by comparing their EmployeeNumber value.
     * Will return in ascending order.
     *
     * @param employee1
     * @param employee2
     * @return -1 if emp1 < emp2
     *          1 if emp1 > emp2
     */

    public int compare(Employee employee1, Employee employee2) {
            if (employee1.getEmployeeNumber() < employee2.getEmployeeNumber()) return -1;
            if (employee1.getEmployeeNumber() > employee2.getEmployeeNumber()) return 1;
            else return 0;
        }
    }

