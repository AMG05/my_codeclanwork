import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane("Boeing", 500, 200);
    }

    @Test
    public void hasType(){
        assertEquals("Boeing", plane.getType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(500, plane.getCapacity());
    }


}
