package observer.base;

/**
 * Created by shanlehong on 2017/10/19.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
