/**
 * Challenge urself
 */
package org.jana.head.decorator;

import org.jana.head.Beverage;
import org.jana.head.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + 0.20;
    }

}
