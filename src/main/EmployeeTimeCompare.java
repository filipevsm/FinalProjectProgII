package main;

import java.util.Comparator;
import java.util.InputMismatchException;

public class EmployeeTimeCompare implements Comparator<Employee> {
    /**
     * This method will sort two Employee objects by comparing their TimeStamp object, which stores the total time
     * they've worked. The method extracts the number of hours in the TimeStamps and compares the two.
     *
     * @param employee1
     * @param employee2
     * @return -1 if emp1 is < emp2
     *          1 if emp1 is > emp2
     */
    public int compare(Employee employee1, Employee employee2) {
            if (employee1.getTimestamp().getHour() < employee2.getTimestamp().getHour()) return -1;
            if (employee1.getTimestamp().getHour() > employee2.getTimestamp().getHour()) return 1;
            else return 0;
        }
    }
