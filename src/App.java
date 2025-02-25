public class App {
    public static void main(String[] args) throws Exception {
        // Employee emp1 = new Employee();
        // System.out.println(emp1.name);
        // emp1.name = "Lajos";
        // System.out.println(emp1.name);

        // Employee emp2 = new Employee("Mari");
        // System.out.println(emp2.name);
        
        // Employee emp3 = new Employee("Kati", 35);
        // System.out.println(emp3.name + " " + emp3.kor);

        Engineer eng1 = new Engineer();
        eng1.name = "Pali";
        eng1.kor = 28;
        // eng1.diploma = "abc84838";
        System.out.println(eng1.name + " " + eng1.diploma);
        Engineer eng2 = new Engineer("Dani");
        System.out.println(eng2.name + " " + eng2.diploma);
    }
}
