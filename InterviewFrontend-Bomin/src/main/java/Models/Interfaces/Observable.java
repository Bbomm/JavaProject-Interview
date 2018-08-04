package Models.Interfaces;

/**
 * Created by 김보민 on 2017-08-13.
 */
public interface Observable {

    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
