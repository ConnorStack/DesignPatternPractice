package practice.designpatterns.ObserverPattern;

public interface Subject {
    public void regesterObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
