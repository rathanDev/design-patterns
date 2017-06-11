/**
 * Challenge urself
 */
package org.jana.store;

import org.jana.factory.ChicagoPizzaFactory;
import org.jana.factory.PizzaFactory;
import org.jana.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    private PizzaFactory pizzaFactory;

    public ChicagoPizzaStore() {
        pizzaFactory = new ChicagoPizzaFactory();
    }

    public Pizza createPizza(String pizzaType) {
        System.out.println("Order is taken from chicago pizza store");
        return pizzaFactory.createPizza(pizzaType);
    }

}
