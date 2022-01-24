import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {
    ArrayList<ISell>stock;

    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addToStock(ISell item){
        stock.add(item);
    };

    public void removeFromStock(ISell item){
        stock.remove(item);
    };

    public double potentialRevenue(){
        double wallet = 0;
        for (ISell item: stock){
            wallet += item.calculateMarkup();
        }
        return wallet;
    }

}
