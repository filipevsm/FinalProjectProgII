package main;

import java.util.Comparator;

public class EmployeeTotalWageCompare implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2) {
        if (employee1.getTotalWage() < employee2.getTotalWage()) return -1;
        if (employee1.getTotalWage() > employee2.getTotalWage()) return 1;
        else return 0;
    }
}