package observer.weather;

import observer.base.DisplayElement;
import observer.base.Observer;
import observer.base.Subject;

/**
 * Created by shanlehong on 2017/10/19.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay( Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity  = humidity;
        display();

    }

    @Override
    public void display() {
        System.out.println("Current Conditions:"+temp+"F degress and "+humidity+"% humidity");
    }
}