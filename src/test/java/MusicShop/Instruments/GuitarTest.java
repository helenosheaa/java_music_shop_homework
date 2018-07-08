package MusicShop.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Brown", "Wood", InstrumentType.STRING, 6, 155.99, 300.99);
    }

    @Test
    public void canGetColour(){
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canGetType(){
        assertEquals("String", guitar.getInstrumentType());
    }

    @Test
    public void canGetNoOfStrings(){
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canMakeNoise(){
        assertEquals("Struuum", guitar.makeNoise("Struuum"));
    }

    @Test
    public void canGetCostPrice(){
        assertEquals(155.99, guitar.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(300.99, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(145.00, guitar.calculateMarkUp(), 0.01);
    }
}