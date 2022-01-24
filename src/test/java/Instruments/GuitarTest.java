package Instruments;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(200, 100, "Fender", "Jazzmaster", "Red", InstrumentType.String, 6);
    }

    @Test
    public void hasBrand(){
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void hasColour(){
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.String, guitar.getInstrument());
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(200, guitar.getSellingPrice());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(100, guitar.getPurchasePrice());
    }

    @Test
    public void hasModel(){
        assertEquals("Jazzmaster", guitar.getModel());
    }

    @Test

    public void hasMarkup(){
        assertEquals(100, guitar.calculateMarkup(), 0.0);
    }

    @Test

    public void makesNoise(){
        assertEquals("**DISTORTED SOUND**", guitar.instrumentSound());
    }
}