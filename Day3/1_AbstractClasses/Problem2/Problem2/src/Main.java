public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Raju",1,10000L);
        Developer developer = new Developer("Rajesh",2,15000L);

        System.out.println("Manager annual Salary - "+manager.calculateAnnualSalary());
        System.out.println("Developer annual Salary - "+developer.calculateAnnualSalary());




    }
}