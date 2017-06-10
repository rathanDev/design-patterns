/**
 * Challenge urself
 */
package org.jana.duck;

import org.jana.behavior.FlyBehavior;
import org.jana.behavior.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void showOff();

    public void doFly() {
        flyBehavior.fly();
    }

    public void doQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks swim even decoys float");
    }

}
