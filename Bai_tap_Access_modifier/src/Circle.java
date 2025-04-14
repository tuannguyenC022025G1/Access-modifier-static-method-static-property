public class Circle {
    private double radius = 1.0;
    private String color = "red";

    // Constructor không tham số
    public Circle() {
    }

    // Constructor có tham số
    public Circle(double r) {
        radius = r;
    }

    // Phương thức trả về bán kính
    public double getRadius() {
        return radius;
    }

    // Phương thức trả về diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
