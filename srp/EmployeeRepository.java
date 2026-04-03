package srp;

// SRP Fix: persistence is its own responsibility, out of Employee
public class EmployeeRepository {
    public void save(Employee employee) {
        System.out.println("Saving employee to DB: " + employee.getName());
    }
}
