import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Passenger passenger;
    Passenger passenger1;
    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
        flightManager = new FlightManager(plane);
        flight = new Flight("FR756", "GLA", "EDI", "10am", plane);
        passenger = new Passenger ("Monica");
        passenger1 = new Passenger("Ross");
    }

    @Test
    public void canCalculateBaggageWeightPerPassenger(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger1);
        assertEquals(10, flightManager.calculateBaggageWeightPerPassenger());
    }





}
