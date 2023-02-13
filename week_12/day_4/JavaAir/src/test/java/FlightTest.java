import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

        Flight flight;
        Plane plane;
        Pilot pilot1;
        Pilot pilot2;
        CabinCrewMember cabinCrewMember1;
        CabinCrewMember cabinCrewMember2;
        CabinCrewMember cabinCrewMember3;
        Passenger passenger1;
        Passenger passenger2;
        Passenger passenger3;
        Passenger passenger4;
        Passenger passenger5;

        @Before
        public void setUp() {
            flight = new Flight("ABC123", "LON", "GLA", "12.00");
            plane = new Plane("Concorde", 10,100);
            pilot1 = new Pilot("Fox", "Captain","Fox123");
            pilot2 = new Pilot("Falco", "First Officer", "FAL123");
            cabinCrewMember1 = new CabinCrewMember("Keith", "Flight Attendant");
            cabinCrewMember2 = new CabinCrewMember("Harrison", "Flight Attendant");
            cabinCrewMember3 = new CabinCrewMember("Colin", "Flight Attendant");
            passenger1 = new Passenger("Jenny", 2);
            passenger2 = new Passenger("Leighton", 1);
            passenger3 = new Passenger("Fred", 3);
            passenger4 = new Passenger("Yvonne", 1);
            passenger5 = new Passenger("Wayde", 1);
        }


        @Test
        public void canGetPassengerName() {
            assertEquals("Jenny", passenger1.getName());
        }

//        @Test
//        public void canAddPassenger() {
//            flight.addPassengers(passenger1);
//            assertEquals(1, flight.getBookedPassengers());
//        }
//
//        @Test
//        public void canRetrieveAvailSeats() {
//            flight.addPassengers(passenger1);
//            assertEquals(9, flight.getAvailableSeats(plane));
//        }



}
