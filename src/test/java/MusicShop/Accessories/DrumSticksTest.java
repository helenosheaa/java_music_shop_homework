package MusicShop.Accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("Wooden set of Two", 5,10);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Wooden set of Two", drumSticks.getDescription());
    }

    @Test
    public void canGetPriceBought(){
        assertEquals(5, drumSticks.getPriceBought());
    }


    @Test
    public void canGetSellPrice(){
        assertEquals(10, drumSticks.getSellPrice());
    }
}