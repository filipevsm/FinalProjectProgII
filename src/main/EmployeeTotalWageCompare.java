package main;

import java.util.Comparator;
import java.util.InputMismatchException;

public class EmployeeTotalWageCompare implements Comparator<Employee> {
    /**
     * This method will sort two Employee objects by comparing their totalWage, which is calculated in the Employee class
     * by isolating the wage due for each hour, minute and second and then totaling them.
     *
     * @param employee1
     * @param employee2
     * @return -1 if emp1 < emp2
     *          1 if emp1 > emp2
     *
     */
    public int compare(Employee employee1, Employee employee2) throws InputMismatchException{
            if (employee1.getTotalWage() < employee2.getTotalWage()) return -1;
            if (employee1.getTotalWage() > employee2.getTotalWage()) return 1;
            else return 0;
        }
    }
