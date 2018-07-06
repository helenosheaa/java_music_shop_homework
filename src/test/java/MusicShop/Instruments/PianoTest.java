package MusicShop.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Black and White", "Plastic", InstrumentType.PERCUSSION, 88);
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


}