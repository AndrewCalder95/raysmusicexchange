package Instruments;

public class Piano extends Instrument {

    private PianoType pianoType;

    public Piano(int sellingPrice, int purchasePrice, String brand, String colour, InstrumentType instrument, PianoType pianoType) {
        super(sellingPrice, purchasePrice, brand, colour, instrument);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    @Override
    public String instrumentSound() {
        return "Beautiful Melody";
    }
}
