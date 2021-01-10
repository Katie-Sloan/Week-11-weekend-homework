import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

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
        flight = new Flight("FR756", "GLA", "EDI", LocalDateTime.of(2021, 05, 5, 07, 30), plane);
        passenger = new Passenger ("Monica", 2);
        passenger1 = new Passenger("Ross", 1);
        passenger2 = new Passenger("Chandler", 2);
        passenger3 = new Passenger("Joey", 2);
        passenger4 = new Passenger("Phoebe", 1);
        passenger5 = new Passenger("Rachel", 3);
    }

    @Test
    public void passengerCountStartsAt0() {
        assertEquals(0, flight.passengerCount());
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
        assertEquals("Date: 2021-05-05 Time: 07:30", flight.getDepartureTime());
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
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
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        assertEquals(5, flight.passengerCount());
    }

    @Test
    public void cantBookAPassenger_overCapacity(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger5);
        assertEquals(5, flight.passengerCount());
    }

    @Test
    public void calculateTotalNumberOfBagsBooked(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger1);
        assertEquals(3, flight.totalBagsCount());
    }

    @Test
    public void canCalculateTotalWeight(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger1);
        assertEquals(30, flight.calculateTotalWeight());
    }

    @Test
    public void canCalculateBaggageWeightPerPassenger(){
        assertEquals(10, flight.calculateBaggageWeightPerPassenger());
    }

}
