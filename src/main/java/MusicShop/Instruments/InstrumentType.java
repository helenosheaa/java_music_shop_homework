package MusicShop.Instruments;

public enum InstrumentType {
    ELECTRIC("Electric"),
    PERCUSSION("Percussion"),
    STRING("String");

    private String type;

    InstrumentType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

}
