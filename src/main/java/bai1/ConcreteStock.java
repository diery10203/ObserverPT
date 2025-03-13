package bai1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteStock implements Stock {
    private String symbol;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public ConcreteStock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
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
            observer.update(price);
        }
    }

    public void setPrice(double price) {
        System.out.println("Giá cổ phiếu " + symbol + " thay đổi từ " + this.price + " thành " + price);
        this.price = price;
        notifyObservers();
    }
}
