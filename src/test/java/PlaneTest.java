import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetType(){
        assertEquals(PlaneType.BOEING747, plane.getType());
    }

    @Test
    public void canGetPassengerCapacity(){
        assertEquals(5, plane.getPassengerCapacity());
    }

    @Test
    public void canGetTotalWeight(){
        assertEquals(100, plane.getTotalWeight());
    }

}
