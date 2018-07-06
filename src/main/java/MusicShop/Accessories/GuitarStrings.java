package MusicShop.Accessories;

public class GuitarStrings {

    private String description;
    private int priceBought;
    private int sellPrice;

    public GuitarStrings(String description, int priceBought, int sellPrice){
        this.description = description;
        this.priceBought = priceBought;
        this.sellPrice = sellPrice;
    }

    public int getPriceBought() {
        return this.priceBought;
    }

    public int getSellPrice() {
        return this.sellPrice;
    }

    public String getDescription() {
        return this.description;
    }
}
