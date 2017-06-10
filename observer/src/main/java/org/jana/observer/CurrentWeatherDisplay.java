/**
 * Challenge urself
 */
package org.jana.observer;

import org.jana.other.Display;
import org.jana.subject.Subject;

public class CurrentWeatherDisplay implements Observer, Display {

    private Subject subject;

    private float temperature;
    private float humidity;

    public CurrentWeatherDisplay(Subject subject) {
        this.subject = subject;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public void display() {
        System.out.println("CurrentWeatherDisplay{" + "temperature=" + temperature + ", humidity=" + humidity + '}');
    }

    @Override
    public String toString() {
        return "CurrentWeatherDisplay{" +
                "subject=" + subject +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }

}
