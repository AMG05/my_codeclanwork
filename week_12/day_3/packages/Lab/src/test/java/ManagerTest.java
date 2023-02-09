import org.junit.Before;
import org.junit.Test;
import Management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Gregg", "PQ472643Z", 672000.50, "Back-End");
    }

    @Test
    public void hasANInumber() {
        assertEquals("PQ472643Z", manager.getNInumber());
    }

    @Test
    public void hasASalary() {
        assertEquals(672000.50, manager.getSalary(), 0.0);
    }

    @Test
    public void hasAName() {
        assertEquals("Gregg", manager.getName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5.0);
        assertEquals(705_600.53, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(6_720 , manager.payBonus(), 0.1);
    }

    @Test
    public void cantRaiseSalaryWithNegativeValue(){
        manager.raiseSalary(-5.0);
        assertEquals(672000.50, manager.getSalary(), 0.1);
    }

    @Test
    public void canChangeName(){
        manager.setName("John");
        assertEquals("John", manager.getName());
    }

}
