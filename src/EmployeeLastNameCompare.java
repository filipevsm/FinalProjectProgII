import java.util.Comparator;

public class EmployeeLastNameCompare implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getLastName().compareTo(employee2.getLastName());
    }
}
