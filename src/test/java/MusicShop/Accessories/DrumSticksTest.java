package MusicShop.Accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("Deez DrumSticks", "Wooden set of Two", 5.99, 10.99);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Wooden set of Two", drumSticks.getDescription());

    }

    @Test
    public void canGetName(){
        assertEquals("Deez DrumSticks", drumSticks.getName());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(10.99, drumSticks.getSellPrice(), 0.01);
    }


    @Test
    public void canGetCostPrice() {
        assertEquals(5.99, drumSticks.getCostPrice(), 0.01);
    }
}