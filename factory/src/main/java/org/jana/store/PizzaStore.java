/**
 * Challenge urself
 */
package org.jana.store;

import org.jana.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza order(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.bake();
        pizza.cut();
        pizza.pack();
        return pizza;
    }

    public abstract Pizza createPizza(String pizzaType);

}
