package OtherItems;

import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void before() {
        drumsticks = new Drumsticks(10, 4, "Vater", TipType.ball);
    }

    @Test
    public void getInstrument() {
        assertEquals(InstrumentType.Percussion, drumsticks.getInstrument());
    }

    @Test
    public void getBrand() {
        assertEquals("Vater", drumsticks.getBrand());
    }

    @Test
    public void getTipType() {
        assertEquals(TipType.ball, drumsticks.getTipType());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(6, drumsticks.calculateMarkup(), 0.0);
    }
}