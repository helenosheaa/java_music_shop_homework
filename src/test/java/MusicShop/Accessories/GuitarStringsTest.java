package MusicShop.Accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("Good Guitar", "Nick wound electric", 5, 10);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Nickel wound electric", guitarStrings.getDescription());
    }

    @Test
    public void canGetName(){
        assertEquals("Good Guitar", guitarStrings.getName());
    }

    @Test
    public void canGetPriceBought(){
        assertEquals(5, guitarStrings.getPriceBought());
    }


    @Test
    public void canGetSellPrice(){
        assertEquals(10, guitarStrings.getSellPrice());
    }
}