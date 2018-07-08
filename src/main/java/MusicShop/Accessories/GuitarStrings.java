package MusicShop.Accessories;

import MusicShop.Behaviours.ISell;


public class GuitarStrings extends Accessory implements ISell {

    private double costPrice;
    private double sellPrice;

    public GuitarStrings(String name, String description, double costPrice, double sellPrice) {
        super(name, description);
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double getCostPrice() {
        return this.costPrice;
    }

    @Override
    public double calculateMarkUp() {
        double markUp = sellPrice - costPrice;
        return markUp;
    }
}
