/**
 * Challenge urself
 */
package org.jana;

public abstract class GraphicObject {

    int x,y;

    public void moveTo(int newX, int newY) {
        System.out.println(String.format("Moving from x to %s and from y to %s", newX, newY));
    }

    public abstract void draw();

}
