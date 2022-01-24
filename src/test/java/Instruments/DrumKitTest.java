package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumKitTest {

    DrumKit drumKit;

    @Before
    public void before() {
        drumKit = new DrumKit(500, 600, "Mapex", "Meridian", "Red", InstrumentType.Percussion);

    }

    @Test
    public void getSeries() {
        assertEquals("Meridian", drumKit.getSeries());
    }

    @Test
    public void instrumentSound() {
        assertEquals("Bang Crash", drumKit.instrumentSound());
    }
}