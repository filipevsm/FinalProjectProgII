package main;
import java.util.Comparator;
import java.util.InputMismatchException;

public class EmployeeLastNameCompare implements Comparator<Employee> {
    /**
     * This method will sort two Employee objects by comparing their lastName value. Output will be an alphabetically
     * (A-Z) sorted list of Employees.
     * @param employee1
     * @param employee2
     * @return
     */

    public int compare(Employee employee1, Employee employee2) {
        try{
            return employee1.getLastName().compareTo(employee2.getLastName());

        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
