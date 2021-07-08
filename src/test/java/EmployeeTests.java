import main.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTests {

    @Test
    public void testGetFirstName(){
        Employee e = new Employee(123456,"Meghrig","Terzian",25.5);
        assertEquals("Meghrig",e.getFirstName());
    }

    @Test
    public void testGetLastName(){
        Employee e = new Employee(123456,"Meghrig","Terzian",25.5);
        assertEquals("Terzian",e.getLastName());
    }

    @Test
    public void testGetEmployeeNumber(){
        Employee e = new Employee(123456,"Meghrig","Terzian",25.5);
        assertEquals(123456,e.getEmployeeNumber());
    }

    @Test
    public void testGetHourlyWage(){
        Employee e = new Employee(123456,"Meghrig","Terzian",25.5);
        assertEquals(25.5,e.getHourlyWage());
    }

    @Test
    public void testSetFirstName(){
        Employee e = new Employee(123456,"Meghrig","Terzian",25.5);
        e.setFirstName("This is a test");
        assertEquals("This is a test",e.getFirstName());
    }

    @Test
    public void testSetLastName(){
        Employee e = new Employee(123456,"Meghrig","Terzian",25.5);
        e.setLastName("This is a test");
        assertEquals("This is a test",e.getLastName());
    }

    @Test
    public void testSetEmployeeNumber(){
        Employee e = new Employee(123456,"Meghrig","Terzian",25.5);
        e.setEmployeeNumber(654321);
        assertEquals(654321,e.getEmployeeNumber());
    }

    @Test
    public void testSetHourlyWage(){
        Employee e = new Employee(123456,"Meghrig","Terzian",25.5);
        e.setHourlyWage(10.7);
        assertEquals(10.7,e.getHourlyWage());
    }
}