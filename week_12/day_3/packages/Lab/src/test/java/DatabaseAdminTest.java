import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;


public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Josh", "ZJ658424D", 69_000.00);
    }

    @Test
    public void hasANInumber() {
        assertEquals("ZJ658424D", databaseAdmin.getNInumber());
    }

    @Test
    public void hasASalary() {
        assertEquals(69_000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void hasAName() {
        assertEquals("Josh", databaseAdmin.getName());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(5.0);
        assertEquals(72_450, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(690, databaseAdmin.payBonus(), 0.1);
    }

}
