package org.jana.secret.sale;

import org.jana.secret.Sale;

import java.math.BigDecimal;

public class HotelSale extends Sale {

    private final BigDecimal basePrice;
    private final long count;

    public HotelSale(long count) {
        this.basePrice = BigDecimal.valueOf(200);
        this.count = count;
    }

    @Override
    public BigDecimal getPrice() {
        //  ( basePrice * count ) - discount
        return basePrice.multiply(BigDecimal.valueOf(count)).subtract(getDiscount());
    }

    @Override
    public BigDecimal getDiscount() {
        // some complex calculation such as
        // basePrice.multiply(BigDecimal.valueOf(count)).divide(BigDecimal.valueOf(15));
        return BigDecimal.valueOf(20);
    }

}
