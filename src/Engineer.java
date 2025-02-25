public class Engineer extends Employee {
    
    String diploma;

    public Engineer(String name) {
        this.name = name;
        this.diploma = "ismeretlen";
    }

    public Engineer() {
        this.diploma = "ismeretlen";
    }

    public void working() {
        System.out.println("mérek...");
    }
}
