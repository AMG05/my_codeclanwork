import java.util.ArrayList;

public class DiningRoom extends Room {
    private String name;
    public DiningRoom(String name, int capacity, ArrayList<Guest> guestList) {
        super(capacity, guestList);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
