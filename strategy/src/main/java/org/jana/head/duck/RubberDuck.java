/**
 * Challenge urself
 */
package org.jana.head.duck;

import org.jana.head.behavior.FlyNoWay;
import org.jana.head.behavior.SqueakQuack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new SqueakQuack();
    }

    public void showOff() {
        System.out.println("Regular rubber duck");
    }

}
