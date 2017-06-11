package org.jana;

import org.jana.factory.ChicagoPizzaFactory;
import org.jana.pizza.Pizza;
import org.jana.store.ChicagoPizzaStore;
import org.junit.Test;

public class AppTest {

    @Test
    public void test() {

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza cheese = chicagoPizzaStore.order("cheese");

    }

}
