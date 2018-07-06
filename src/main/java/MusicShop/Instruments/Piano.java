package MusicShop.Instruments;

public class Piano extends Instrument {
    private int noOfKeys;

    public Piano(String colour, String material, InstrumentType type, int noOfKeys){
        super(colour, material, type);
            this.noOfKeys = noOfKeys;
        }

    public int getNoOfKeys(){
        return this.noOfKeys;
    }

    @Override
    public String makeNoise(String noise) {
        return "Plink plonk";
    }
}
