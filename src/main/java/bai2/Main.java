package bai2;

public class Main {
    public static void main(String[] args) {
        // Tạo các thành viên trong nhóm
        ConcreteObserver member1 = new ConcreteObserver("Thành viên A");
        ConcreteObserver member2 = new ConcreteObserver("Thành viên B");

        // Tạo công việc cụ thể
        ConcreteTask task = new ConcreteTask("Phát triển tính năng X", "Chưa bắt đầu");

        // Đăng ký các thành viên để theo dõi công việc
        task.attach(member1);
        task.attach(member2);

        // Thay đổi trạng thái công việc và thông báo cho các thành viên
        task.setStatus("Đang thực hiện");

        // Hủy đăng ký một thành viên và thay đổi trạng thái công việc lần nữa
        task.detach(member1);
        task.setStatus("Hoàn thành");
    }
}
