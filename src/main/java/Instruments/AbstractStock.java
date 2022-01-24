package Instruments;

public abstract class AbstractStock {
    private int purchasePrice;
    private int sellingPrice;

    public AbstractStock(int sellingPrice, int purchasePrice) {
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
