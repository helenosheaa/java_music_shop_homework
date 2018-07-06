package MusicShop.Accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Piano songs for Dummies", 5,10);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Piano songs for Dummies", sheetMusic.getDescription());
    }

    @Test
    public void canGetPriceBought(){
        assertEquals(5, sheetMusic.getPriceBought());
    }


    @Test
    public void canGetSellPrice(){
        assertEquals(10, sheetMusic.getSellPrice());
    }
}