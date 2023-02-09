import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest{
    private DiningRoom diningRoom;

    @Before
    public void setup() {
        Guest guest1 = new Guest("Henry");
        Guest guest2 = new Guest("Penelope");
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        guestList.add(guest2);
        diningRoom = new DiningRoom("The Best Fining Room", 40, guestList);
    }

    @Test
    public void getRoomName() {
        assertEquals("The Best Fining Room", diningRoom.getName());
    }
}
