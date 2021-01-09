import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() { passenger = new Passenger("Monica"); }

    @Test
    public void hasName() { assertEquals("Monica", passenger.getName()); }

}
