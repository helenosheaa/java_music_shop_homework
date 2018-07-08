package MusicShop.Instruments;

import MusicShop.Behaviours.ISell;

public class Guitar extends Instrument implements ISell {
    private int noOfStrings;
    private double costPrice;
    private double sellPrice;

    public Guitar(String colour, String material, InstrumentType type, int noOfStrings, double costPrice, double sellPrice) {
        super(colour, material, type);
        this.noOfStrings = noOfStrings;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public int getNoOfStrings(){
        return this.noOfStrings;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double getCostPrice() {
        return this.costPrice;
    }

    @Override
    public String makeNoise(String noise) {
        return "Struuum";
    }


    @Override
    public double calculateMarkUp() {
        double markUp = sellPrice - costPrice;
        return markUp;
    }
}
