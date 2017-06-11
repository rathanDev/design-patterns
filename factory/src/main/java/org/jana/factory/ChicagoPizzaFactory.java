/**
 * Challenge urself
 */
package org.jana.factory;

import org.jana.factory.PizzaFactory;
import org.jana.pizza.ChicagoCheesePizza;
import org.jana.pizza.Pizza;

public class ChicagoPizzaFactory extends PizzaFactory {

    public Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("cheese")) {
            return new ChicagoCheesePizza();
        }
        throw new UnsupportedOperationException("Not available");
    }

}
