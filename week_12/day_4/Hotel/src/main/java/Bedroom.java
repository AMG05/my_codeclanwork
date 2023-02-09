import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;
    private double nightlyRate;


    public Bedroom(RoomType roomType, ArrayList<Guest> guests, int roomNumber, double nightlyRate) {
        super(roomType.getCapacity(), guests);
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}
