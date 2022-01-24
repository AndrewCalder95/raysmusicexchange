package OtherItems;

import Instruments.AbstractStock;
import Instruments.InstrumentType;
import Interfaces.ISell;

public class Drumsticks extends AbstractStock implements ISell {

    private InstrumentType instrument;
    private String brand;
    private TipType tipType;

    public Drumsticks(int sellingPrice, int purchasePrice, String brand, TipType tipType) {
        super(sellingPrice, purchasePrice);
        this.instrument = InstrumentType.Percussion;
        this.brand = brand;
        this.tipType = tipType;
    }

    public InstrumentType getInstrument() {
        return instrument;
    }

    public String getBrand() {
        return brand;
    }

    public TipType getTipType() {
        return tipType;
    }

    @Override
    public double calculateMarkup() {
        return getSellingPrice() - getPurchasePrice();
    }
}
