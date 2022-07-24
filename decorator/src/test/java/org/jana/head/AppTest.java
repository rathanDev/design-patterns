package org.jana.head;


import org.jana.head.Beverage;
import org.jana.head.beverage.DarkRoast;
import org.jana.head.beverage.Expresso;
import org.jana.head.decorator.Mocha;
import org.jana.head.decorator.Whip;
import org.junit.Test;

public class AppTest {

    @Test
    public void test() {

        Beverage beverage1 = new Expresso();
        System.out.println("beverage1 = " + beverage1.getDescription() + " cost=" + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println("beverage2 = " + beverage2.getDescription() + " cost=" + beverage2.cost());

    }

}
