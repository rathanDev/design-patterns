/*
 * Challenge urself
 */
package org.jana;

public class Bulb {

    private State state;

    Bulb() {
        this(State.OFF);
    }

    Bulb(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Bulb{" +
                "state=" + state +
                '}';
    }
}
