/**
 * Challenge urself
 */
package org.jana;

public class TurnOnBulb implements Command {

    private Bulb bulb;

    public TurnOnBulb(Bulb bulb) {
        this.bulb = bulb;
    }

    public void execute() {
        bulb.setState(State.ON);
    }

}
