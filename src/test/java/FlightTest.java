import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight("FR756", "GLA", "EDI", "10am", plane);

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
        assertEquals(416, flight.returnAvailableSeats());
    }

    @Test
    public void canReturnAvailableSeatsWhenSomeSeatsTaken(){
        passenger = new Passenger ("Monica");
        flight.addPassenger(passenger);
        assertEquals(415, flight.returnAvailableSeats());
    }

}
