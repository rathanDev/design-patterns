/**
 * Challenge urself
 */
package org.jana;

public class TurkeyDuckAdapter extends Duck {

    Turkey turkey;

    public TurkeyDuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        turkey.fly();
    }
}
