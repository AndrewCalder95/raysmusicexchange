package Instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;
    private String model;

    public Guitar(int sellingPrice, int purchasePrice, String brand, String model, String colour, InstrumentType instrument, int numberOfStrings) {
        super(sellingPrice, purchasePrice, brand, colour, instrument);
        this.numberOfStrings = numberOfStrings;
        this.model = model;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getModel() {
        return model;
    }

    public String instrumentSound(){
        return "**DISTORTED SOUND**";
    }

}
