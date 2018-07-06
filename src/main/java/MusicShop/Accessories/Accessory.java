package MusicShop.Accessories;

import MusicShop.Behaviours.ISell;

public abstract class Accessory implements ISell {
    private String name;
    private String description;
    private int priceBought;
    private int sellPrice;

    public Accessory(String name, String description, int priceBought, int sellPrice){
        this.name = name;
        this.description = description;
        this.priceBought = priceBought;
        this.sellPrice = sellPrice;
        }

    public int getPriceBought() {
        return this.priceBought;
    }

    public String getName(){
        return this.name;
    }

    public int getSellPrice() {
        return this.sellPrice;
    }

    public String getDescription() {
        return this.description;
    }

}
