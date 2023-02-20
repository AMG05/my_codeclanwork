import Instrument.Guitar;
import Instrument.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("brass", "gold", "woodwind", 300.00, 500.00);
    }

    @Test
    public void canGetType() {
        assertEquals("woodwind", saxophone.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("brass", saxophone.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("gold", saxophone.getColour());
    }

    @Test
    public void canGetBuyingCost() {
        assertEquals(300.00, saxophone.getBuyingCost(), 00.00);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(500.00, saxophone.getSellingPrice(), 00.00);
    }

    @Test
    public void canGetSound() {
        assertEquals("Hawh", saxophone.play());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(200.00, saxophone.calculateMarkup(), 00.00);
    }
}