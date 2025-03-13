package bai2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteTask implements Task {
    private String taskName;
    private String status;
    private List<Observer> observers = new ArrayList<>();

    public ConcreteTask(String taskName, String status) {
        this.taskName = taskName;
        this.status = status;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }

    public void setStatus(String status) {
        System.out.println("Tình trạng công việc \"" + taskName + "\" đã thay đổi từ \"" + this.status + "\" thành \"" + status + "\".");
        this.status = status;
        notifyObservers();
    }
}
