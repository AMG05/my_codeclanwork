import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Jeff", "Purser", "12345");
    }

    @Test
    public void hasName(){
        assertEquals("Jeff", pilot.getName());
    }

    @Test
    public void canFly(){
        assertEquals("Yay I can fly!", pilot.canFly());
    }


}
