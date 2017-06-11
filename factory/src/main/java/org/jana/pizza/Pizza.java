package org.jana.pizza;

/**
 * Challenge urself
 */
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;

    public void bake() {
        System.out.println("Baking");
    }

    public void cut(){
        System.out.println("Cutting");
    }

    public void pack(){
        System.out.println("Packing");
    }

}
