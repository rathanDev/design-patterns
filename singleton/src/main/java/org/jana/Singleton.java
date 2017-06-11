/**
 * Challenge urself
 */
package org.jana;

public class Singleton {

    public static volatile Singleton instance;
//    volatile ensures that multiple threads handle the instance correctly

    private Singleton(){}

//    double checked locking
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
