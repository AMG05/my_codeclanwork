import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    String flightNumber;
    String destination;
    String departureAirport;
    String departureTime;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<Pilot>(1);
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>(2);
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

//    public int getBookedPassengers() {
//        return passengers.size();
//    }

//    public void addPassengers(Passenger passenger1) {
//        return passengers.add(passenger1);
//    }

//    public int getAvailableSeats(Plane plane) {
//        return 0;
//    }
}
