package main;

import java.util.Comparator;

public class EmployeeTimeCompare implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2) {
        if (employee1.getTimestamp().getHour() < employee2.getTimestamp().getHour()) return -1;
        if (employee1.getTimestamp().getHour() > employee2.getTimestamp().getHour()) return 1;
        else return 0;
    }
}