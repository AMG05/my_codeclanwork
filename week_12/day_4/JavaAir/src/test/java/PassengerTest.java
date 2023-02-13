import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Anne", 5);
    }

    @Test
    public void hasName() {
        assertEquals("Anne", passenger.getName());
    }

    @Test
    public void hasBags() {
        assertEquals(5, passenger.getBags());
    }
}
