package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument extends AbstractStock implements IPlay, ISell {

    private String colour;
    private String brand;
    private InstrumentType instrument;

    public Instrument(int sellingPrice, int purchasePrice, String brand, String colour, InstrumentType instrument) {
        super(sellingPrice, purchasePrice);
        this.brand = brand;
        this.colour = colour;
        this.instrument = instrument;
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public InstrumentType getInstrument() {
        return instrument;
    }


    public double calculateMarkup(){
            return getSellingPrice() - getPurchasePrice();
    }

}
