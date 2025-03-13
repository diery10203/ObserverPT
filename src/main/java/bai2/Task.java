package bai2;

public interface Task {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
