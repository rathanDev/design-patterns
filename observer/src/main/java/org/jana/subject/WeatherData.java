/**
 * Challenge urself
 */
package org.jana.subject;

import org.jana.observer.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject {

    private Set<Observer> observers;

    private float temperature;
    private float humidity;

    public WeatherData() {
        observers = new HashSet<Observer>();
    }

    public void setData(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;

        doNotify();
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void doNotify() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "observers=" + observers +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
