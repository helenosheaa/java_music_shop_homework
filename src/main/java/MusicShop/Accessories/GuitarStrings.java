package MusicShop.Accessories;

import MusicShop.Behaviours.ISell;

public class GuitarStrings extends Accessory {


    public GuitarStrings(String name, String description, int priceBought, int sellPrice) {
        super(name, description, priceBought, sellPrice);
    }

    @Override
    public int calculateMarkup(int priceBought, int sellingPrice) {
        return 0;
    }
}
