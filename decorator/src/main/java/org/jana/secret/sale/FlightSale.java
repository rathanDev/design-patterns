package org.jana.secret.sale;

import org.jana.secret.Sale;

import java.math.BigDecimal;

public class FlightSale extends Sale {

    private final BigDecimal basePrice;
    private final long count;

    public FlightSale(long count) {
        this.basePrice = BigDecimal.valueOf(300);
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
        // basePrice.multiply(BigDecimal.valueOf(count)).divide(BigDecimal.valueOf(25));
        return BigDecimal.valueOf(25);
    }

}
