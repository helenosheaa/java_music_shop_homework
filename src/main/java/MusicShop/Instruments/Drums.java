package MusicShop.Instruments;

import MusicShop.Behaviours.ISell;

public class Drums extends Instrument implements ISell {
    private int sizeOfSet;
    private double costPrice;
    private double sellPrice;

    public Drums(String colour, String material, InstrumentType type, int sizeOfSet, double costPrice, double sellPrice) {
        super(colour, material, type);
        this.sizeOfSet = sizeOfSet;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public int getSizeOfSet(){
        return this.sizeOfSet;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double getCostPrice() {
        return this.costPrice;
    }

    @Override
    public String makeNoise(String noise) {
        return "Ra tat tat";
    }

    @Override
    public double calculateMarkUp() {
        double markUp = sellPrice - costPrice;
        return markUp;
    }
}
