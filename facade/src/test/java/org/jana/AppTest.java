/**
 * Challenge urself
 */
package org.jana;

import org.junit.Test;

public class AppTest {

    @Test
    public void test() {

        Circle circle = new Circle();
        Line line = new Line();

        ShapeMaker shapeMaker = new ShapeMaker(circle, line);
        shapeMaker.drawCircle();
        shapeMaker.drawLine();

    }

}
