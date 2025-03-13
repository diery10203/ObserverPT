package bai1;

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(name + " nhận được thông báo: Giá cổ phiếu thay đổi thành " + price);
    }
}
