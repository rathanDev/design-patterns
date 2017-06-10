/**
 * Challenge urself
 */
package org.jana.duck;

import org.jana.behavior.FlyNoWay;
import org.jana.behavior.SqueakQuack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new SqueakQuack();
    }

    public void showOff() {
        System.out.println("Regular rubber duck");
    }

}
