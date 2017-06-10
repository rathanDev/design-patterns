package org.jana;

import org.jana.beverage.DarkRoast;
import org.jana.beverage.Expresso;
import org.jana.decorator.Mocha;
import org.jana.decorator.Soya;
import org.junit.Test;

public class AppTest {

    @Test
    public void test() {

        Beverage beverage1 = new Expresso();    //6
        System.out.println("beverage1 = " + beverage1.getDescription() + " cost=" + beverage1.getCost());

        Beverage beverage2 = new DarkRoast();   //5
        beverage2 = new Mocha(beverage2);       //2
        beverage2 = new Mocha(beverage2);       //2
        beverage2 = new Soya(beverage2);        //1
        System.out.println("beverage2 = " + beverage2.getDescription() + " cost=" + beverage2.getCost());

    }

}
