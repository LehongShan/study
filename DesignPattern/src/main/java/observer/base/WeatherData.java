package observer.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shanlehong on 2017/10/19.
 */
public class WeatherData implements Subject {

    private List observes;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observes = new ArrayList();
    }
    @Override
    public void registerObserver(Observer o) {
        observes.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observes.indexOf(o)!=-1){
            observes.remove(o);
        }

    }

    @Override
    public void notifyObservers() {
        for (int i =0; i<observes.size();i++){
            Observer observer = (Observer) observes.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp,float humidity,float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
