/**
 * Challenge urself
 */
package org.jana.decorator;

import org.jana.Beverage;
import org.jana.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public int getCost() {
        return beverage.getCost() + 2;
    }
}
