import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
//    Plane plane;

    @Before
    public void setUp() {
        flight = new Flight("FR756", "GLA");
//        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void passengerCountStartsAt0() {
        assertEquals(0, flight.passengerCount());
    }

//    @Test
//    public void hasPlane() {
//        assertEquals(plane, flight.getPlane());
//    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("GLA", flight.getDestination());
    }

}
