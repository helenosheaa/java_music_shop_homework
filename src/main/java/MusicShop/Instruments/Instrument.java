package MusicShop.Instruments;

import MusicShop.Behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String colour;
    private String material;
    private InstrumentType type;

    public Instrument(String colour, String material, InstrumentType type){
        this.colour = colour;
        this.material = material;
        this.type = type;
    }

    public String getColour(){
        return this.colour;
    }

    public String getMaterial(){
        return this.material;
    }

    public String getInstrumentType(){
        return this.type.getType();
    }

}
