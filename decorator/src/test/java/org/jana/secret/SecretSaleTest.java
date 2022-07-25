package org.jana.secret;

import org.jana.secret.decorator.Baggage;
import org.jana.secret.sale.HotelSale;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SecretSaleTest {

    @Test
    public void test() {
        long count = 4;
        Sale sale = new HotelSale(count);
        sale = new Baggage(sale);
        BigDecimal price = sale.getPrice();
        // ( ( 4 * 200 ) - 20 ) + 10 = 790
        Assert.assertEquals(BigDecimal.valueOf(790), price);
    }

}
