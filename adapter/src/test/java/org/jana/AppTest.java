package org.jana;

import org.junit.Test;

public class AppTest {

    @Test
    public void test() {

        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();

        Turkey turkey = new WildTurkey();

        Duck duckStrange = new TurkeyDuckAdapter(turkey);
        duckStrange.quack();
        duckStrange.fly();
    }

}
