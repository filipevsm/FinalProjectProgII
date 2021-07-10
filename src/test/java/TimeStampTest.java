import main.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeStampTest {
    @Test
    public void testSetHour() {
        TimeStamp t = new TimeStamp(1,11,11);
        t.setHour(1);
        assertEquals(1, t.getHour());
    }

    @Test
    public void testGetHour() {
        Employee e = new Employee(123456, "Meghrig", "Terzian", 25.5);
        assertEquals("Meghrig", e.getFirstName());
    }

    @Test
    public void testSetSec() {
        Employee e = new Employee(123456, "Meghrig", "Terzian", 25.5);
        assertEquals("Meghrig", e.getFirstName());
    }

    @Test
    public void testGetSec() {
        Employee e = new Employee(123456, "Meghrig", "Terzian", 25.5);
        assertEquals("Meghrig", e.getFirstName());
    }

    @Test
    public void testSetMin() {
        Employee e = new Employee(123456, "Meghrig", "Terzian", 25.5);
        assertEquals("Meghrig", e.getFirstName());
    }

    @Test
    public void testGetMin() {
        Employee e = new Employee(123456, "Meghrig", "Terzian", 25.5);
        assertEquals("Meghrig", e.getFirstName());
    }
    @Test
    public void testAddMin() {
        Employee e = new Employee(123456, "Meghrig", "Terzian", 25.5);
        assertEquals("Meghrig", e.getFirstName());
    }
    @Test
    public void testAddHour() {
        Employee e = new Employee(123456, "Meghrig", "Terzian", 25.5);
        assertEquals("Meghrig", e.getFirstName());
    }
    @Test
    public void testAddSec() {
        Employee e = new Employee(123456, "Meghrig", "Terzian", 25.5);
        assertEquals("Meghrig", e.getFirstName());
    }
}
