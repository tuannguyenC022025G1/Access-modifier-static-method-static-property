public class Main {
    public static void main(String[] args) {
        Student student = new Student(); // Tạo đối tượng Student

        // Gán giá trị mới cho name và class
        student.setName("Alice");
        student.setClasses("C05");

        // In ra thông tin để kiểm tra
        student.displayInfo();
    }
}
