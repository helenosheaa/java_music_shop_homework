package MusicShop.Instruments;

public class Guitar extends Instrument {
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
}
