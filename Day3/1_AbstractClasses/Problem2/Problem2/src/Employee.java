public abstract class Employee {
    public String name;
    public int id;
    public Long salary;

    public abstract Long calculateAnnualSalary();

    public Employee(String name, int id, Long salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}
