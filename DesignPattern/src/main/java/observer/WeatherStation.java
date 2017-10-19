package observer;

import observer.base.WeatherData;
import observer.weather.CurrentConditionsDisplay;

/**
 * Created by shanlehong on 2017/10/19.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(81,65,30.4f);
        weatherData.setMeasurements(82,65,30.4f);

    }
}
