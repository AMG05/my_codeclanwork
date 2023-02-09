import java.util.ArrayList;

public abstract class Room {
    protected ArrayList<Guest> guests;
    protected int capacity;

    public Room(int capacity, ArrayList<Guest> guests) {
        this.capacity = capacity;
        this.guests = guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }
    public int getGuestCount() {
        return guests.size();
    }
}
