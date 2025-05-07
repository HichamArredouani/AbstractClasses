class FullTimeEmployee extends Employee implements Workable {

    public FullTimeEmployee (String name) {
        super(name);
    }
    @Override
    public double calculateSalary() {
        return 3000;
    }

    @Override
    public void work() {

    }

}
