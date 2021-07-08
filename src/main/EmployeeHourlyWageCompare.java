package main;

import java.util.Comparator;

public class EmployeeHourlyWageCompare implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2) {
        if (employee1.getHourlyWage() < employee2.getHourlyWage()) return -1;
        if (employee1.getHourlyWage() > employee2.getHourlyWage()) return 1;
        else return 0;
    }
}