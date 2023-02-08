import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    private Bear bear;
    private Salmon salmon;

    private River river;

    @Before
    public void before(){
        bear = new Bear("Baloo");
        salmon = new Salmon();
        river = new River();
        river.addFish(salmon);
    }

    @Test
    public void bellyStartEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eatFishFromRiver(river);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void shouldEvacuateBowels(){
        bear.eatFishFromRiver(river);
        bear.shitInTheWoods();
        assertEquals(0, bear.foodCount());
    }
}
