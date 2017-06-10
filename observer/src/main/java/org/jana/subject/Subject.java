package org.jana.subject;

import org.jana.observer.Observer;

/**
 * Challenge urself
 */
public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void doNotify();

}
