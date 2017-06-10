package org.jana;

import junit.framework.Assert;
import org.jana.observer.CurrentWeatherDisplay;
import org.jana.subject.WeatherData;
import org.junit.Test;

public class AppTest {

    @Test
    public void test() {
        WeatherData weatherData = new WeatherData();

        CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay(weatherData);

        weatherData.register(currentWeatherDisplay);
        weatherData.setData(30.5f, 12.5f);

        currentWeatherDisplay.display();
        Assert.assertEquals(30.5f, currentWeatherDisplay.getTemperature());
        Assert.assertEquals(12.5f, currentWeatherDisplay.getHumidity());

        weatherData.unregister(currentWeatherDisplay);

        weatherData.setData(61.0f, 25.0f);

        currentWeatherDisplay.display();
        Assert.assertEquals(30.5f, currentWeatherDisplay.getTemperature());
        Assert.assertEquals(12.5f, currentWeatherDisplay.getHumidity());
    }

}
