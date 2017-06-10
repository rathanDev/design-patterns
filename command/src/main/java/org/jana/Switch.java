/**
 * Challenge urself
 */
package org.jana;

public class Switch {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

}
