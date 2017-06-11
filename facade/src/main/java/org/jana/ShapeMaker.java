/**
 * Challenge urself
 */
package org.jana;

public class ShapeMaker {

    private GraphicObject circle;
    private GraphicObject line;

    public ShapeMaker(GraphicObject circle, GraphicObject line) {
        this.circle = circle;
        this.line = line;
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawLine() {
        line.draw();
    }

}
