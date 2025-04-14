public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(); // Khởi tạo với mặc định
        Circle c2 = new Circle(2.5); // Khởi tạo với bán kính 2.5

        System.out.println("Circle 1: radius = " + c1.getRadius() + ", area = " + c1.getArea());
        System.out.println("Circle 2: radius = " + c2.getRadius() + ", area = " + c2.getArea());
    }
}
