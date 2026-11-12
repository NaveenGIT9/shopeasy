package com.shopeasy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PriceServiceTest {

    @Test
    void tenPercentOff() {
        PriceService service = new PriceService();
        double result = service.applyDiscount(1000, 10);
        assertEquals(900.0, result);
    }
}
