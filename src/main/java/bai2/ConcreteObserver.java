package bai2;

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(name + " nhận được thông báo: Tình trạng công việc đã thay đổi thành \"" + status + "\".");
    }
}
