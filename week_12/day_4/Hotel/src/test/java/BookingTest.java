import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;

    private Bedroom bedroom;

    @Before
    public void setup(){
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        bedroom = new Bedroom(RoomType.DOUBLE, guestList, 44, 100);
        booking = new Booking(bedroom, 5);
    }

    @Test
    public void getNumberOfNights() {
        assertEquals(5, booking.getNumberOfNights());
    }

    @Test
    public void canProduceBill() {
        double total = booking.getBill();
        assertEquals(500, total, 0.00);
    }
}


