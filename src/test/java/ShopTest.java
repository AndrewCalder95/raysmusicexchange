import Instruments.Guitar;
import Instruments.InstrumentType;
import Interfaces.ISell;
import OtherItems.DifficultyType;
import OtherItems.Drumsticks;
import OtherItems.SheetMusic;
import OtherItems.TipType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest{

    Shop shop;
    Guitar guitar1;
    Guitar guitar2;
    SheetMusic sheetMusic;
    Drumsticks drumsticks;
    ArrayList<ISell> stock = new ArrayList<>();

    @Before
    public void before() {
        shop = new Shop(stock);
        guitar1 = new Guitar(200, 100, "Fender", "Jazzmaster", "Red", InstrumentType.String, 6);
        guitar2 = new Guitar(400, 200, "Fender", "Stratocaster", "Red", InstrumentType.String, 6);
        sheetMusic = new SheetMusic(10, 5, InstrumentType.Keyboard,"Moonlight Sonata", DifficultyType.Advanced);
        drumsticks = new Drumsticks(10, 4, "Vater", TipType.ball);
    }

    @Test public void testAddToStock() {
        shop.addToStock(guitar1);
        shop.addToStock(sheetMusic);
        shop.addToStock(drumsticks);
        assertEquals(3, stock.size());
    }

    @Test
    public void testRemoveFromStock() {
    shop.addToStock(guitar1);
    shop.addToStock(sheetMusic);
    shop.addToStock(drumsticks);
    assertEquals(3, stock.size());
    shop.removeFromStock(guitar1);
    assertEquals(2, stock.size());
    }

    @Test
    public void testPotentialRevenue(){
        shop.addToStock(guitar1);
        shop.addToStock(guitar2);
        shop.addToStock(sheetMusic);
        shop.addToStock(drumsticks);
        assertEquals(311, shop.potentialRevenue(), 0.0);
    }
}