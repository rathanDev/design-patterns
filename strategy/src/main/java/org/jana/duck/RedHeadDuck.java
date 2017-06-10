/**
 * Challenge urself
 */
package org.jana.duck;

import org.jana.behavior.FlyWithWings;
import org.jana.behavior.LoudQuack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new LoudQuack();
    }

    public void showOff() {
        System.out.println("The great Red-Head Duck who fly high and quack loud");
    }

}
