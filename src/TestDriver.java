import java.util.ArrayList;
import java.util.Collections;

public class TestDriver {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(111111,"Aaaaaa","Bbbbbb",10.5));
        list.add(new Employee(333333,"Zzzzzz","Yyyyyy",5.0));
        list.add(new Employee(222222,"Cccccc","Dddddd",5.0));
        list.add(new Employee(555555,"Mmmmmm","Nnnnnn",15.0));

        System.out.println("Sort by Employee Number:");
        EmployeeNumberCompare numberCompare = new EmployeeNumberCompare();
        Collections.sort(list, numberCompare);
        for (Employee employee: list)
            System.out.println(employee.getEmployeeNumber() + " " +
                               employee.getFirstName() + " " +
                               employee.getLastName() + " " +
                               employee.getHourlyWage());

        System.out.println("\nSort by Employee Last Name:");
        EmployeeLastNameCompare lastNameCompare = new EmployeeLastNameCompare();
        Collections.sort(list, lastNameCompare);
        for (Employee employee: list)
            System.out.println(employee.getEmployeeNumber() + " " +
                    employee.getFirstName() + " " +
                    employee.getLastName() + " " +
                    employee.getHourlyWage());

        System.out.println("\nSort by Hourly Wage:");
        EmployeeHourlyWageCompare hourlyWageCompare = new EmployeeHourlyWageCompare();
        Collections.sort(list, hourlyWageCompare);
        for (Employee employee: list)
            System.out.println(employee.getEmployeeNumber() + " " +
                    employee.getFirstName() + " " +
                    employee.getLastName() + " " +
                    employee.getHourlyWage());
    }
}
