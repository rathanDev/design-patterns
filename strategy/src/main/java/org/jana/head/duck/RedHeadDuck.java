/**
 * Challenge urself
 */
package org.jana.head.duck;

import org.jana.head.behavior.FlyWithWings;
import org.jana.head.behavior.LoudQuack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new LoudQuack();
    }

    public void showOff() {
        System.out.println("The great Red-Head Duck who fly high and quack loud");
    }

}
