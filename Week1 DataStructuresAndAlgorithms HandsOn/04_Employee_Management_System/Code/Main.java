public class Main {
    public static void main(String[] args) {
        Company company = new Company(5);

        company.addEmployee(new Employee(301, "Neil", "Mission Commander", 150000));
        company.addEmployee(new Employee(302, "Sally", "Flight Engineer", 135000));
        company.addEmployee(new Employee(303, "Buzz", "Payload Specialist", 125000));
        company.addEmployee(new Employee(304, "Valentina", "Astrophysicist", 140000));
        company.addEmployee(new Employee(305, "Yuri", "Capcom", 110000));

        company.traverseEmployee();

        System.out.println();

        System.out.println("Searched Employee");
        company.searchEmployee(4);

        System.out.println();

        System.out.println("Employee Deleted");
        company.deleteEmployee(2);
        company.traverseEmployee();
    }
}