package org.jana.secret.decorator;

import org.jana.secret.AddOn;
import org.jana.secret.Sale;

import java.math.BigDecimal;

public class Baggage extends AddOn {

    private final BigDecimal amount = BigDecimal.valueOf(10);
    private final Sale sale;

    public Baggage(Sale sale) {
        this.sale = sale;
    }

    @Override
    public BigDecimal getPrice() {
        return sale.getPrice().add(amount);
    }

}
