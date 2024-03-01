public class Developer extends Employee{
    public Developer(String name, int id, Long salary) {
        super(name, id, salary);
    }

    @Override
    public Long calculateAnnualSalary() {
        return 12*salary;
    }
}
