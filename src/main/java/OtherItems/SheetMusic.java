package OtherItems;

import Instruments.AbstractStock;
import Instruments.InstrumentType;
import Interfaces.ISell;

import java.security.DigestInputStream;

public class SheetMusic extends AbstractStock implements ISell {

    private String title;
    private DifficultyType difficulty;
    private InstrumentType instrument;

    public SheetMusic(int sellingPrice, int purchasePrice, InstrumentType instrument, String title, DifficultyType difficulty) {
        super(sellingPrice, purchasePrice);
        this.difficulty = difficulty;
        this.title = title;
        this.instrument = instrument;
    }

    public String getTitle() {
        return title;
    }

    public DifficultyType getDifficulty() {
        return difficulty;
    }

    @Override
    public double calculateMarkup() {
        return getSellingPrice() - getPurchasePrice();
    }
}
