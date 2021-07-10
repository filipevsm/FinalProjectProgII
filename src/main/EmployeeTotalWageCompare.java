package main;

import java.util.Comparator;
import java.util.InputMismatchException;

public class EmployeeTotalWageCompare implements Comparator<Employee> {
    /**
     * This method will sort two Employee objects by comparing their totalWage, which is calculated in the Employee class
     * by isolating the wage due for each hour, minute and second and then totaling them.
     * @param employee1
     * @param employee2
     * @return
     * @see setTotalWage
     */
    // maybe change to boolean?
    public int compare(Employee employee1, Employee employee2) {
        try{
            if (employee1.getTotalWage() < employee2.getTotalWage()) return -1;
            if (employee1.getTotalWage() > employee2.getTotalWage()) return 1;
            else return 0;

        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}