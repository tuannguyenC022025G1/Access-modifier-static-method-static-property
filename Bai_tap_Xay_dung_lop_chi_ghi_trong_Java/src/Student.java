public class Student {
    private String name = "John";
    private String classes = "C02";

    // Constructor không tham số
    public Student() {
    }

    // Phương thức gán giá trị cho name
    public void setName(String name) {
        this.name = name;
    }

    // Phương thức gán giá trị cho classes
    public void setClasses(String classes) {
        this.classes = classes;
    }

    // (Tùy chọn) Thêm phương thức hiển thị để kiểm tra
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Class: " + classes);
    }
}
