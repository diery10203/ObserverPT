package bai1;

public interface Stock {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
