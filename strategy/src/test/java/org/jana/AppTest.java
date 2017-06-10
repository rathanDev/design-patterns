package org.jana;


import org.jana.behavior.FlyWithRocket;
import org.jana.behavior.FlyWithWings;
import org.jana.behavior.LoudQuack;
import org.jana.duck.ModelDuck;
import org.jana.duck.RedHeadDuck;
import org.jana.duck.RubberDuck;
import org.junit.Test;

public class AppTest {

    @Test
    public void test() {
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.showOff();
        redHeadDuck.swim();
        redHeadDuck.doFly();
        redHeadDuck.doQuack();

        System.out.println();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.showOff();
        rubberDuck.swim();
        rubberDuck.doFly();
        rubberDuck.doQuack();

        System.out.println();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.showOff();
        modelDuck.doFly();
        modelDuck.setFlyBehavior(new FlyWithRocket());
        modelDuck.doFly();
    }

}
