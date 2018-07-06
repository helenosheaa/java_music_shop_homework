package MusicShop.Instruments;

import MusicShop.Behaviours.ISell;

public class Guitar extends Instrument implements ISell {
    private int noOfStrings;

    public Guitar(String colour, String material, InstrumentType type, int noOfStrings) {
        super(colour, material, type);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings(){
        return this.noOfStrings;
    }

    @Override
    public String makeNoise(String noise) {
        return "Struuum";
    }


    @Override
    public int calculateMarkup(int priceBought, int sellingPrice) {
        return 0;
    }
}
