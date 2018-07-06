package MusicShop.Instruments;

public class Drums extends Instrument {
    private int sizeOfSet;

    public Drums(String colour, String material, InstrumentType type, int sizeOfSet) {
        super(colour, material, type);
        this.sizeOfSet = sizeOfSet;
    }

    public int getSizeOfSet(){
        return this.sizeOfSet;
    }

    @Override
    public String makeNoise(String noise) {
        return "Ra tat tat";
    }
}
