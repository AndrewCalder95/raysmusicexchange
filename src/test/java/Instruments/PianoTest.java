package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(800, 600, "Steinway", "Black", InstrumentType.Keyboard, PianoType.Grand);
    }

    @Test
    public void getPianoType() {
        assertEquals(PianoType.Grand, piano.getPianoType());
    }

    @Test
    public void instrumentSound() {
        assertEquals("Beautiful Melody", piano.instrumentSound());
    }
}