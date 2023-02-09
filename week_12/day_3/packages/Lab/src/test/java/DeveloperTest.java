import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Dan", "BH452387V", 35_000.00);
    }

    @Test
    public void hasANInumber() {
        assertEquals("BH452387V", developer.getNInumber());
    }

    @Test
    public void hasASalary() {
        assertEquals(35_000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void hasAName() {
        assertEquals("Dan", developer.getName());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(5.0);
        assertEquals(36_750.00, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350 , developer.payBonus(), 0.1);
    }
}
