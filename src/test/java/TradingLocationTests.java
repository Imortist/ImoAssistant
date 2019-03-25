import com.geminysnowflake.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TradingLocationTests {
    private TradingLocation myLocation;

    @BeforeEach
    void beforeEachTestMethod() {
        myLocation = new TradingLocation("Port Olissar");
        myLocation.addItem("Medical Supplies");
        myLocation.addItem("Gold");
        myLocation.getGoodsByPosition(0).setPrices(3.5f, 5.6F);
        myLocation.getGoodsByPosition(1).setPrices(5.5f, 5.6F);
    }



    @Test
    void NewLocationExists(){
        assertNotNull(myLocation);
    }


    @Test
    void AddGoodsToLocation(){
        assertSame(myLocation.getGoodsByPosition(1).getName(), "Gold");
        assertSame(myLocation.getGoodsByPosition(0).getName(), "Medical Supplies");
    }

    @Test
    void GoodsHaveBuyingPrice(){
        assertEquals(myLocation.getGoodsByPosition(0).getPriceBuying(), 3.5f);
        assertEquals(myLocation.getGoodsByPosition(1).getPriceBuying(), 5.5f);
    }
}
