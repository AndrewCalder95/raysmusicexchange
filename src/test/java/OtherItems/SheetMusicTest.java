package OtherItems;

import Instruments.DrumKit;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic(10, 5, InstrumentType.Keyboard,"Moonlight Sonata", DifficultyType.Advanced);
    }

    @Test
    public void getTitle() {
        assertEquals("Moonlight Sonata", sheetMusic.getTitle());
    }

    @Test
    public void getDifficulty() {
        assertEquals(DifficultyType.Advanced, sheetMusic.getDifficulty());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(5, sheetMusic.calculateMarkup(),0.0);
    }
}