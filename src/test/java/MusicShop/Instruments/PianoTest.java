package MusicShop.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Black and White", "Plastic", InstrumentType.PERCUSSION, 88, 600.99, 300.99);
    }

    @Test
    public void canGetColour(){
        assertEquals("Black and White", piano.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Plastic", piano.getMaterial());
    }

    @Test
    public void canGetType(){
        assertEquals("Percussion", piano.getInstrumentType());
    }

    @Test
    public void canGetNoOfKeys(){
        assertEquals(88, piano.getNoOfKeys());
    }

    @Test
    public void canMakeNoise(){
        assertEquals("Plink plonk", piano.makeNoise("Plink plonk"));
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(300.99, piano.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(600.99, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(300.00, piano.calculateMarkUp(), 0.01);
    }
}