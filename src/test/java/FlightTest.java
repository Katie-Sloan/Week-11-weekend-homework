import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight("FR756", "GLA", "EDI", "10am", plane);
        passenger = new Passenger ("Monica");
    }

    @Test
    public void passengerCountStartsAt0() {
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("10am", flight.getDepartureTime());
    }

    @Test
    public void canReturnAvailableSeatsWhenPlaneEmpty(){
        assertEquals(5, flight.returnAvailableSeats());
    }

    @Test
    public void canReturnAvailableSeatsWhenSomeSeatsTaken(){
        flight.bookPassenger(passenger);
        assertEquals(4, flight.returnAvailableSeats());
    }

    @Test
    public void canBookAPassenger_underCapacity(){
        flight.bookPassenger(passenger);
        assertEquals(1, flight.passengerCount());
    }

    @Test
    public void canBookAPassenger_atCapacity(){
        Passenger passenger1 = new Passenger("Ross");
        Passenger passenger2 = new Passenger("Chandler");
        Passenger passenger3 = new Passenger("Joey");
        Passenger passenger4 = new Passenger("Phoebe");
        Passenger passenger5 = new Passenger("Rachel");
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger5);
        assertEquals(5, flight.passengerCount());
    }

}
