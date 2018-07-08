package MusicShop.Instruments;

import MusicShop.Behaviours.ISell;

public class Piano extends Instrument implements ISell {
    private int noOfKeys;
    private double sellPrice;
    private double costPrice;

    public Piano(String colour, String material, InstrumentType type, int noOfKeys, double sellPrice, double costPrice){
        super(colour, material, type);
            this.noOfKeys = noOfKeys;
            this.sellPrice = sellPrice;
            this.costPrice = costPrice;
        }

    public int getNoOfKeys(){
        return this.noOfKeys;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double getCostPrice() {
        return this.costPrice;
    }

    @Override
    public String makeNoise(String noise) {
        return "Plink plonk";
    }


    @Override
    public double calculateMarkUp() {
        double markUp = sellPrice - costPrice;
        return markUp;
    }
}
