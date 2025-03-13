package bai1;

public class Main {
    public static void main(String[] args) {
        // Tạo các nhà đầu tư
        ConcreteObserver investor1 = new ConcreteObserver("Nhà đầu tư A");
        ConcreteObserver investor2 = new ConcreteObserver("Nhà đầu tư B");

        // Tạo cổ phiếu
        ConcreteStock stock = new ConcreteStock("AAPL", 150.0);

        // Đăng ký nhà đầu tư theo dõi cổ phiếu
        stock.attach(investor1);
        stock.attach(investor2);

        // Thay đổi giá cổ phiếu và thông báo cho các nhà đầu tư
        stock.setPrice(155.0);

        // Hủy đăng ký nhà đầu tư1 và thay đổi giá cổ phiếu lần nữa
        stock.detach(investor1);
        stock.setPrice(160.0);
    }
}