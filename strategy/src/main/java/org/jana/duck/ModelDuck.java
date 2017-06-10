/**
 * Challenge urself
 */
package org.jana.duck;

import org.jana.behavior.FlyNoWay;
import org.jana.behavior.LoudQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
//        In default model duck does not fly and quacks loud
        flyBehavior = new FlyNoWay();
        quackBehavior = new LoudQuack();
    }

    public void showOff() {
        System.out.println("A model Duck which evolves with time");
    }

}
