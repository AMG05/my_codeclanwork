import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private ArrayList<Guest> guestList;
    private ArrayList<Guest> guestListEmpty;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Hotel hotel;
    private DiningRoom diningRoom1;
    private DiningRoom diningRoom2;
    private HashMap<String, DiningRoom> hashyMap;

    @Before
    public void setup(){
        Guest guest1 = new Guest("Henry");
        Guest guest2 = new Guest("Penelope");
        guestList = new ArrayList<>();
        guestListEmpty = new ArrayList<>();
        guestList.add(guest1);
        guestList.add(guest2);
        bedroom1 = new Bedroom(RoomType.DOUBLE, guestListEmpty, 44, 100);
        bedroom2 = new Bedroom(RoomType.DOUBLE, guestListEmpty, 55, 100);
        ArrayList<Bedroom> bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        conferenceRoom1 = new ConferenceRoom (50, guestListEmpty, "Pancake");
        conferenceRoom2 = new ConferenceRoom (50, guestListEmpty, "Pancake");
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);
        hotel = new Hotel(bedrooms, conferenceRooms);
        diningRoom1 = new DiningRoom("The Best Fining Room", 40, guestList);
        diningRoom2 = new DiningRoom("The Worst Fining Room", 40, guestList);
        hashyMap = new HashMap<>();
        hashyMap.put(diningRoom1.getName(), diningRoom1);
        hashyMap.put(diningRoom2.getName(), diningRoom2);
    }


    @Test
    public void getConferenceRoom() {
        assertEquals(50, conferenceRoom1.getCapacity());
    }

    @Test
    public void checkInOfRoom(){
        hotel.checkIn(bedroom1, guestList);
        assertEquals(2, bedroom1.getGuestCount());
    }
    @Test
    public void checkInOfConferenceRoom(){
        hotel.checkIn(conferenceRoom1, guestList);
        assertEquals(2, conferenceRoom1.getGuestCount());
    }
    @Test
    public void checkOutOfRoom() {
        hotel.checkIn(bedroom1, guestList);
        hotel.checkOut(bedroom1);
        assertEquals(0, bedroom1.getGuestCount());
    }
    @Test
    public void checkOutOfConferenceRoom() {
        hotel.checkIn(conferenceRoom1, guestList);
        hotel.checkOut(conferenceRoom1);
        assertEquals(0, conferenceRoom1.getGuestCount());
    }
    @Test
    public void bookRoomReturnsNewBooking() {
        Booking newBooking = hotel.bookRoom(bedroom1, 5);
        assertEquals(5, newBooking.getNumberOfNights());
    }


}
