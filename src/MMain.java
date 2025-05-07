public class MMain {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Alice");
        PartTimeEmployee emp2 = new PartTimeEmployee("Bob", 20, 15);
        emp1.work();
        System.out.println("Salary: $" + emp1.calculateSalary());
        emp2.work();
        System.out.println("Salary: $" + emp2.calculateSalary());
    }
}
