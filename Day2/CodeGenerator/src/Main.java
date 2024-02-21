import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> staffList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter IT support staff details. Type 'exit' to finish.");


        while (true) {
            System.out.print("Enter first name: ");
            String firstName = sc.nextLine();
            if ("exit".equalsIgnoreCase(firstName)) {
                break;
            }

            System.out.print("Enter last name: ");
            String lastName = sc.nextLine();

            int dept;
            do {
                System.out.print("Enter department:\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal\n");
                dept = sc.nextInt();
                sc.nextLine();
            } while (dept > 4);

            String department;
            department = switch (dept){
                case 1 -> "tech";

                case 2 -> "admin";

                case 3 -> "hr";

                case 4 -> "legal";

                default -> "";
            };

            Employee staffMember = new Employee(firstName, lastName, department);
            staffList.add(staffMember);

            System.out.println("New IT support staff added: " + staffMember);
        }

        sc.close();

        // Optionally, print out all staff members added to the list
        System.out.println("\nList of IT support staff:");
        for (Employee staff : staffList) {
            System.out.println(staff.getFirstName()+" "+staff.getLastName());
        }
    }

}
