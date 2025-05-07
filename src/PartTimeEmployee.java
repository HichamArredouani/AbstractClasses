class PartTimeEmployee extends Employee implements Workable {
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
    @Override
    public void work() {
        System.out.println(name + " is working part-time.");
    }
}