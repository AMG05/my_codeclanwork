import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }
    public void checkIn(Room room, ArrayList<Guest> guests) {
        room.setGuests(guests);
    }

    public void checkOut(Room room){
        ArrayList<Guest> newGuestList = new ArrayList<>();
        room.setGuests(newGuestList);
    }

    public Booking bookRoom(Bedroom bedroom, int noOfNights) {
        Booking newBooking = new Booking(bedroom, noOfNights);
        return newBooking;
    }
}
