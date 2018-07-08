package MusicShop.Accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("Good Guitar", "Nickel wound electric", 5.99, 10.99);
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
    public void canGetCostPrice(){
        assertEquals(5.99, guitarStrings.getCostPrice(), 0.01);
    }


    @Test
    public void canGetSellPrice(){
        assertEquals(10.99, guitarStrings.getSellPrice(), 0.01);
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(5.00, guitarStrings.calculateMarkUp(), 0.01);
    }
}