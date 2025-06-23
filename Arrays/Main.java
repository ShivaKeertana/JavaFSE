public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        Employee e1 = new Employee(101, "Keerthana", "Developer", 50000);
        Employee e2 = new Employee(102, "Akshay", "Manager", 75000);
        Employee e3 = new Employee(103, "Abhay", "HR", 45000);

        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);

        System.out.println("\nAll Employees:");
        manager.listEmployees();

        System.out.println("\nSearching for ID 102:");
        Employee found = manager.searchEmployee(102);
        System.out.println(found != null ? found : "Not Found");

        System.out.println("\nDeleting ID 101:");
        manager.deleteEmployee(101);
        
        System.out.println("\nUpdated Employees:");
        manager.listEmployees();
    }
}
