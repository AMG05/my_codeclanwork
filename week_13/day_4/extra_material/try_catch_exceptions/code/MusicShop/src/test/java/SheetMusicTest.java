import Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Classics", 15.00, 30.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Classics", sheetMusic.getName());
    }

    @Test
    public void canGetBuyingCost() {
        assertEquals(15.00, sheetMusic.getBuyingCost(), 00.00);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(30.00, sheetMusic.getSellingPrice(), 00.00);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(15.00, sheetMusic.calculateMarkup(), 00.00);
    }
}
