import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void setup(){
        Guest guest1 = new Guest("Henry");
        Guest guest2 = new Guest("Penelope");
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        guestList.add(guest2);
        bedroom = new Bedroom(RoomType.DOUBLE, guestList, 44, 100);
    }

    @Test
    public void getRoomCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }
}
