package org.jana;

/*
 * Challenge urself
 */
public enum State {

    ON(1), OFF(0);

    private int stateInt;

    State(int stateInt) {
        this.stateInt = stateInt;
    }

    public int getStateInt() {
        return stateInt;
    }

}
