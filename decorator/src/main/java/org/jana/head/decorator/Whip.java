/**
 * Challenge urself
 */
package org.jana.head.decorator;

import org.jana.head.Beverage;
import org.jana.head.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + 0.60;
    }

}
