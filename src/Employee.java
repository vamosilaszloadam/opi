public class Employee {
    String name;
    int kor;
    public Employee() {
        this.name = "névtelen";
        this.kor = 0;
    }
    public Employee(String name) {
        this.name = name;
    }
    public Employee(String name, int kor) {
        this.name = name;
        this.kor = kor;
    }
}
