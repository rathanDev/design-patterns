package org.jana.secret;

import java.math.BigDecimal;

public abstract class AddOn extends Sale {

    @Override
    public BigDecimal getDiscount() {
        return BigDecimal.ZERO;
    }

}
