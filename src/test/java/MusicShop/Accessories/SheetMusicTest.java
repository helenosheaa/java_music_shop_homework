package MusicShop.Accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Sheety Music","Piano songs for Dummies", 5.99,10.99);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Piano songs for Dummies", sheetMusic.getDescription());
    }

    @Test
    public void canGetName(){
        assertEquals("Sheety Music", sheetMusic.getName());
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(5.99, sheetMusic.getCostPrice(), 0.01);
    }


    @Test
    public void canGetSellPrice(){
        assertEquals(10.99, sheetMusic.getSellPrice(), 0.01);
    }
}