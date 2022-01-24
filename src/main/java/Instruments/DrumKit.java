package Instruments;

public class DrumKit extends Instrument{

    private String series;

    public DrumKit(int sellingPrice, int purchasePrice, String brand, String series, String colour, InstrumentType instrument) {
        super(sellingPrice, purchasePrice, brand, colour, instrument);
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    @Override
    public String instrumentSound() {
        return "Bang Crash";
    }
}
