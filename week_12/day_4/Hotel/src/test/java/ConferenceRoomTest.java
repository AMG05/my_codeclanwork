import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void setup(){
        Guest guest1 = new Guest("Henry");
        Guest guest2 = new Guest("Penelope");
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        guestList.add(guest1);
        guestList.add(guest2);
        conferenceRoom = new ConferenceRoom(50, guestList, "Pancake");
    }

    @Test
    public void canGetRoomCapacity() {
        assertEquals(50, conferenceRoom.getCapacity());
    }
    @Test
    public void canGetRoomName() {
        assertEquals("Pancake", conferenceRoom.getRoomName());
    }
}
