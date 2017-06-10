/**
 * Challenge urself
 */
package org.jana.decorator;

import org.jana.Beverage;
import org.jana.CondimentDecorator;

public class Soya extends CondimentDecorator {

    public Soya(Beverage beverage) {
        super.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soya";
    }

    public int getCost() {
        return beverage.getCost() + 1;
    }
}
