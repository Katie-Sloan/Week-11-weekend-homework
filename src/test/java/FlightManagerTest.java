import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight1;
    Passenger passenger;
    Passenger passenger1;
    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
        flightManager = new FlightManager();
        flight1 = new Flight("FR756", "GLA", "EDI", LocalDateTime.of(2021, 05, 5, 07, 30), plane);
        passenger = new Passenger ("Monica", 2);
        passenger1 = new Passenger("Ross", 1);
    }

    @Test
    public void flightsListStartsAt0() {
        assertEquals(0, flightManager.flightCount());
    }

    @Test
    public void canAddAFlight() {
        flightManager.addFlight(flight1);
        assertEquals(1, flightManager.flightCount());
    }

    @Test
    public void canFindAFlight() {
        flightManager.addFlight(flight1);
        Flight foundFlight = flightManager.findFlight("FR756");
        assertEquals(flight1, foundFlight);
    }

    @Test
    public void canCalculateBaggageWeightEach(){
        flightManager.addFlight(flight1);
        Flight foundFlight = flightManager.findFlight("FR756");
        assertEquals(10, flightManager.calculateBaggageWeightEach(foundFlight.getFlightNumber()));
    }

    @Test
    public void canCalculateTotalBaggageWeightBooked(){
        flightManager.addFlight(flight1);
        flight1.bookPassenger(passenger);
        flight1.bookPassenger(passenger1);
        assertEquals(30, flightManager.calculateTotalBaggageWeightBooked(flight1.getFlightNumber()));
    }

    @Test
    public void canCalculateOverallBaggageWeightRemaining(){
        flightManager.addFlight(flight1);
        flight1.bookPassenger(passenger);
        flight1.bookPassenger(passenger1);
        assertEquals(20, flightManager.calculateOverallBaggageWeightRemaining(flight1.getFlightNumber()));
    }

}
