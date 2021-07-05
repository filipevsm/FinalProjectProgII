import java.util.Comparator;

public class EmployeeNumberCompare implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2) {
        if (employee1.getEmployeeNumber() < employee2.getEmployeeNumber()) return -1;
        if (employee1.getEmployeeNumber() > employee2.getEmployeeNumber()) return 1;
        else return 0;
    }
}
