package MusicShop;

import MusicShop.Accessories.Accessory;
import MusicShop.Behaviours.ISell;
import MusicShop.Instruments.Instrument;

import java.util.ArrayList;


public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private ISell iSell;


    public Shop(String name){
        this.name = name;
        stock = new ArrayList<ISell>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addStock(ISell iSell){
        this.stock.add(iSell);
    }

    public void emptyStock(){
        this.stock.clear();
    }

//    public boolean removeItemFromStock(ISell iSell) {
//        return false;
//    }
}
