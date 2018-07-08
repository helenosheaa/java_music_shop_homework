package MusicShop;

import MusicShop.Accessories.GuitarStrings;
import MusicShop.Instruments.Guitar;
import MusicShop.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    GuitarStrings guitarStrings;


    @Before
    public void before() {
        shop = new Shop("Ray's Music Exchange");

        guitar = new Guitar("Brown", "Wood", InstrumentType.STRING, 6, 55.99, 100.99);

        guitarStrings = new GuitarStrings("Stringy", "Good set of Strings", 5.99, 10.99);
    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void stockCountStartsAtZero(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddItemsToStock(){
        shop.addStock(guitar);
        shop.addStock(guitarStrings);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canClearStock(){
        shop.addStock(guitarStrings);
        shop.emptyStock();
        assertEquals(0, shop.stockCount());
    }

//    @Test
//    public void canRemoveItemFromStock(){
//        shop.addStock(guitarStrings);
//        shop.removeItemFromStock(guitarStrings);
//        assertEquals(0, shop.stockCount());
//    }


}