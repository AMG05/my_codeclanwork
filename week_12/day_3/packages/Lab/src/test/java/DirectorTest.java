import org.junit.Before;
import org.junit.Test;
import Management.Director;

import static org.junit.Assert.assertEquals;

    public class DirectorTest {

        Director director;

        @Before
        public void before(){
            director = new Director("Fat Cat", "RS763875T", 670_000.00, "Global", 1_000_000.00);
        }

        @Test
        public void hasANInumber() {
            assertEquals("RS763875T", director.getNInumber());
        }

        @Test
        public void hasASalary() {
            assertEquals(670_000.00, director.getSalary(), 0.0);
        }

        @Test
        public void hasAName() {
            assertEquals("Fat Cat", director.getName());
        }

        @Test
        public void canRaiseSalary() {
            director.raiseSalary(5.0);
            assertEquals(703500.0, director.getSalary(), 0.1);
        }

        @Test
        public void canPayBonus(){
            assertEquals(6700.00 , director.payBonus(), 0.1);
        }

        @Test
        public void canGetBudget(){
            assertEquals(1_000_000.00, director.getBudget(), 0.1);
        }

    }
