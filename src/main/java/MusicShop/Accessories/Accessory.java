package MusicShop.Accessories;

public abstract class Accessory {
    private String name;
    private String description;


    public Accessory(String name, String description){
        this.name = name;
        this.description = description;
        }

    public String getName(){
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

}

