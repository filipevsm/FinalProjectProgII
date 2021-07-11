import main.TimeStamp;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class TimeStampTest {
    @Test
    public void testSetHour() {
        TimeStamp t = new TimeStamp(1,1,1);
        t.setHour(1);
        assertEquals(1, t.getHour());
    }

    @Test
    public void testGetHour() {
        TimeStamp t = new TimeStamp(1,1,1);
        assertEquals(1, t.getHour());
    }
    @Test
    public void testAddHour() {
        TimeStamp t = new TimeStamp(1,1,1);
        t.addHour(1);
        assertEquals(2, t.getHour());
    }

    @Test
    public void testSetSec() {
        TimeStamp t = new TimeStamp(1,1,1);
        t.setSec(1);
        assertEquals(1, t.getSec());
    }

    @Test
    public void testGetSec() {
        TimeStamp t = new TimeStamp(1,1,1);
        assertEquals(1, t.getSec());
    }
    @Test
    public void testAddSec() {
        TimeStamp t = new TimeStamp(1,1,1);
        t.addSec(1);
        assertEquals(2, t.getSec());
    }

    @Test
    public void testSetMin() {
        TimeStamp t = new TimeStamp(1,1,1);
        t.setMin(1);
        assertEquals(1, t.getMin());
    }

    @Test
    public void testGetMin() {
        TimeStamp t = new TimeStamp(1,1,1);
        assertEquals(1, t.getHour());
    }
    @Test
    public void testAddMin() {
        TimeStamp t = new TimeStamp(1,1,1);
        t.addMin(1);
        assertEquals(2, t.getMin());

    }


}