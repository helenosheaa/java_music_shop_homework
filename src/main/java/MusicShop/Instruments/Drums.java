package MusicShop.Instruments;

import MusicShop.Behaviours.ISell;

public class Drums extends Instrument implements ISell {
    private int sizeOfSet;

    public Drums(String colour, String material, InstrumentType type, int sizeOfSet) {
        super(colour, material, type);
        this.sizeOfSet = sizeOfSet;
    }

    public int getSizeOfSet(){
        return this.sizeOfSet;
    }

    @Override
    public String makeNoise(String noise) {
        return "Ra tat tat";
    }

    @Override
    public int calculateMarkup(int boughtPrice, int SellingPrice) {
        return 0;
    }
}
