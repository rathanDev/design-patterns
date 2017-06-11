/**
 * Challenge urself
 */
package org.jana.store;

import org.jana.factory.NewYorkPizzaFactory;
import org.jana.factory.PizzaFactory;
import org.jana.store.PizzaStore;
import org.jana.pizza.Pizza;

public class NewYorkPizzaStore extends PizzaStore {

    private PizzaFactory pizzaFactory;

    public NewYorkPizzaStore() {
        this.pizzaFactory = new NewYorkPizzaFactory();
    }

    public Pizza createPizza(String pizzaType) {
        return pizzaFactory.createPizza(pizzaType);
    }
}
