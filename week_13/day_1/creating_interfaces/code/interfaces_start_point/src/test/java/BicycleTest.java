import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BicycleTest {
    private Bicycle bicycle;

    @Before
    public void before() {
        bicycle = new Bicycle();
    }

    @Test
    public void hasDistanceAtBeginning() {
        assertEquals(0, bicycle.getDistanceTravelled());
    }

    @Test
    public void canMove(){
        bicycle.move(10);
        assertEquals(10, bicycle.getDistanceTravelled());
    }

    @Test
    public void canStart(){
        bicycle.start("Vroom");
        assertEquals("Vroom", car.canStart());
    }

    @Test
    public void canStop(){
        bicycle.stop("Gently apply pressure on the brakes");
        assertEquals("Gently apply pressure on the brakes", car.canStop());
    }
}
