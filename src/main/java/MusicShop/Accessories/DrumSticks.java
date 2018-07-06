package MusicShop.Accessories;

public class DrumSticks {

    private String description;
    private int priceBought;
    private int sellPrice;

    public DrumSticks(String description, int priceBought, int sellPrice){
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
