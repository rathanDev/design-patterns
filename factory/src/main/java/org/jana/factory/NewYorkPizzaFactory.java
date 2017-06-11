/**
 * Challenge urself
 */
package org.jana.factory;

import org.jana.pizza.NewYorkCheesePizza;
import org.jana.pizza.Pizza;

public class NewYorkPizzaFactory extends PizzaFactory {

    public Pizza createPizza(String pizzaType) {
        if (pizzaType.equals("cheese")) {
            return new NewYorkCheesePizza();
        }
        return null;
    }
}
