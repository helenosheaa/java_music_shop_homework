package MusicShop.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Brown", "Wood", InstrumentType.STRING, 6);
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
}