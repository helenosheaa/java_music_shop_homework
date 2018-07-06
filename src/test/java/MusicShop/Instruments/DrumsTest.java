package MusicShop.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumsTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums("Grey", "Metal", InstrumentType.PERCUSSION);
    }

    @Test
    public void canGetColour(){
        assertEquals("Grey", drums.getColour());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Metal", drums.getMaterial());
    }

    @Test
    public void canGetType(){
        assertEquals("Percussion", drums.getInstrumentType());
    }


}