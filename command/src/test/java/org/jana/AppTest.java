package org.jana;

import org.junit.Test;

public class AppTest {

    @Test
    public void test() {

        Bulb bulb = new Bulb();
        System.out.println("bulb = " + bulb);

        TurnOnBulb turnOnBulb = new TurnOnBulb(bulb);

        Switch aSwitch = new Switch();
        aSwitch.setCommand(turnOnBulb);
        aSwitch.press();

        System.out.println("bulb = " + bulb);
    }

}